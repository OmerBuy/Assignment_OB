package assignments.day_9_assingment4;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your number : ");
		int no = sc.nextInt();

		String num = "a";
		switch (num) {
		case "a":
			if (no == 0 | no == 1 | no == 2) {
				System.out.println("Its Low Number");
			} else if (no == 3 | no == 4 | no == 5) {
				System.out.println("Its Medium Number");
			} else
				System.out.println("Its Other Number");

		}sc.close();

	}
}
