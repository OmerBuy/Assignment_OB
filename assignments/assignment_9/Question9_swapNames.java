package assignments.assignment_9;

import java.util.Scanner;

public class Question9_swapNames {

	public static void main(String[] args) {

//		In this task, 
//		you need to swap first name with last name in the email. 
//		If email doesn't contains underscore - do not anything. 
//		Example:
//		input: mike_tyson@gmail.com
//		output: tyson_mike@gmail.com
//
//		Example:
//		input: viktoryakubovich@gmail.com
//		output: viktoryakubovich@gmail.com
		Scanner scan = new Scanner(System.in);

		String email = scan.next();
		String newEmail = "";
		int indexOfUnderScore = email.indexOf('_');
		int indexOfAt = email.indexOf('@');

		if (indexOfUnderScore > 0) {
			newEmail += email.substring((indexOfUnderScore + 1), indexOfAt);
			newEmail += "_";

			newEmail += email.substring(0, indexOfUnderScore);
			newEmail += email.substring(indexOfAt, email.length());
			System.out.println(newEmail);
		} else {
			System.out.println(email);
		}
		System.out.println(newEmail);

	}

}
