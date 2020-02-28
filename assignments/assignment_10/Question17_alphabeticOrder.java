package assignments.assignment_10;

import java.util.Scanner;

public class Question17_alphabeticOrder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Write your 2 with alphabetic order charecters ");
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int from = 0, to = 0;
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);

		if (alphabets.contains(String.valueOf(start)) && alphabets.contains(String.valueOf(end))) {

			from = alphabets.indexOf(start);
			to = alphabets.indexOf(end) + 1;

			System.out.println(alphabets.substring(from, to));

		} else if (alphabets.toLowerCase().contains(String.valueOf(start))
				&& alphabets.toLowerCase().contains(String.valueOf(end))) {

			from = alphabets.toLowerCase().indexOf(start);
			to = alphabets.toLowerCase().indexOf(end) + 1;

			System.out.println(alphabets.toLowerCase().substring(from, to));

		}

	}

}
