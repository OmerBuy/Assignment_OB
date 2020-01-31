package assignments.day_9_assingment4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is your mass?");
		int mass = sc.nextInt();
		double weight;
		weight = (mass * 9.8);
		if (weight > 1000) {
			System.out.println("Ur mass is equal to " + weight + " newton");
			System.out.println("Its too heavy");

		} else if (weight < 10) {
			System.out.println("Ur mass is equal to " + weight + " newton");
			System.out.println("its too light");
		} else {
			System.out.println("invalid mass.");
		}
		sc.close();
	}

}
