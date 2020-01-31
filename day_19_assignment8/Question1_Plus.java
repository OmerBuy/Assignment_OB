package assignments.day_19_assignment8;

import java.util.Scanner;

public class Question1_Plus {

	public static void main(String[] args) {

		plus();

	}

	public static void plus() {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number:");
		int a = sc.nextInt();
		System.out.print("enter second number:");
		int b = sc.nextInt();
	
		System.out.println("Result:"+(a + b));
		sc.close();
	}
}
