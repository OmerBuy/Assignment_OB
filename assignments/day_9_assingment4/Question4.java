package assignments.day_9_assingment4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
//		Write a Java program to calculate the monthly telephone bills as per the following rule: 
//			Minimum $200 for up to 100 calls. 
//			Plus $0.60 per call for the next 50 calls. 
//			Plus $0.50 per call for the next 50 calls. 
//			Plus $0.40 per call for any call beyond 200 calls.
		Scanner sc = new Scanner(System.in);
		System.out.println("How many calling you have?");
		int calling = sc.nextInt();
		double bill = 0;
		if (calling <= 100) {
			bill = 200;
		} else if (calling <= 150) {
			bill = 200 + (calling - 100) * 0.60;
		} else if (calling <= 200) {
			bill = 200 + 50 * 0.60 + (calling - 150) * 0.50;
		} else {
			bill = 200 + 50 * 0.60 + 50 * 0.50 + (calling - 200) * 0.40;
		}
		System.out.println("Your telephone bill is " + bill + "$");
		sc.close();
	}

}
