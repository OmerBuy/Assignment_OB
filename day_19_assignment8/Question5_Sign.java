package assignments.day_19_assignment8;

import java.util.Scanner;

public class Question5_Sign {

	public static void main(String[] args) {

		sign();
	}

	public static int sign() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int sign = sc.nextInt();
		if (sign > 0) {
			System.out.println("1");
		} else if (sign < 0) {
			System.out.println("-1");
		} else {
			System.out.println("0");
			sc.close();
		}
		return sign;
	}

}
