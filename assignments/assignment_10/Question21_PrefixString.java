package assignments.assignment_10;

import java.util.Scanner;

public class Question21_PrefixString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ur word  ");
		String str = scan.next();
		System.out.print("Enter a number ");
		int n = scan.nextInt();

		String prefix = str.substring(0, n);
		int exist = str.indexOf(prefix, n);

		if (exist > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
