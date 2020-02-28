package assignments.assignment_10;

import java.util.Scanner;

public class Question19_returnNumOfTimes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ur word");
		String word = scan.next();

		int count = 0;
		int Included = -1;

		for (int i = 0; i < word.length(); i++) {

			Included = word.indexOf("java", i);

			if (Included != -1) {
				count++;
				i = Included;
				Included = -1;

			}
		}
		System.out.println(count);
		
	}

}
