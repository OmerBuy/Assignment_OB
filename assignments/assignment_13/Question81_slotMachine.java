package assignments.assignment_13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question81_slotMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String[] images = { "Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars" };
		boolean control= true;
		double prizeTotal = 0;
		double moneyTotal=0;
		
		do {
		System.out.print("Please enter the amount of money tp enter into: ");
		double money = scan.nextDouble();
		moneyTotal+=money;
		String[] results = new String[3];

		for (int i = 0; i < 3; i++) {
			int randomIndex = random.nextInt(6);
			results[i] = images[randomIndex];
		}

		System.out.println(Arrays.toString(results));
		double prize=0;
		
		if (!results[0].equals(results[1]) && !results[0].equals(results[2]) && !results[1].equals(results[2])) {
			prize += 0;
		} else if (results[0].equals(results[1]) && results[1].equals(results[2]) && results[0].equals(results[2])) {
			prize += money * 3;
		} else {
			prize += money * 2;
		}
		prizeTotal+=prize;
		System.out.println("You won $" + prize);
		System.out.println("Do you want to play again? \"True||False\": ");
		control= scan.nextBoolean();
		
		} while (control);
		
		System.out.printf("%30s %s %6.2f\n","Total Amount of Money Entered:", "$",moneyTotal);
		System.out.printf("%30s %s %6.2f\n","Total Amount of Won Prize:", "$", prizeTotal);
		System.out.printf("%30s %s %6.2f\n","Total Profit:", "$",(prizeTotal-moneyTotal));
		scan.close();
	}

}