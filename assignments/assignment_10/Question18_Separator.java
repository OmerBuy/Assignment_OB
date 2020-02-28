package assignments.assignment_10;

import java.util.Scanner;

public class Question18_Separator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ur word");
		String word = scan.next();
		
		System.out.println("Enter ur seperator charecter");
		String separator = scan.next();// scan.nextLine();

		System.out.println("How many word would u like to write?");
		int count = scan.nextInt();

		String result = "";

		while (count > 0) {
			count--;
			result += word;
			if (count != 0) {
				result += separator;
			}

		}
		System.out.println(result);
	}

}





