package assignments.day_4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		System.out.println("Kaç paralýk biþey aldýn!");

		Scanner sc = new Scanner(System.in);
		int cost = sc.nextInt();
		int change = 100- cost;//100-60=40
		int quarter = change /25; // 40/25 = 1quarter 40-25=15 
		change = change % 25; //40-25=15 40%25 = 15
		int dime = change/10; // 15/10=1    15%10= 5
		change = change % 10; //15%10= 5
		int nickles = change /5; // 5/5=1
		change= 100-cost;
		System.out.println("aldýðýn þeyin ücreti " + cost);
		System.out.println("para üstü  " + (100-cost));
		System.out.println("quarters  " + quarter);
		System.out.println("dimes   " + dime);
		System.out.println("nickles  " + nickles);
		
		sc.close();

	}

}
