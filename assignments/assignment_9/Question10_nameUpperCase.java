package assignments.assignment_9;

import java.util.Scanner;

public class Question10_nameUpperCase {

	public static void main(String[] args) {

		/*Write a program that will print out information about the user based on email. 
		Print first and last name from the upper case.
		Sample Output:
		     Input: craig_federighi@apple.com
		    Output:
		           First name: Craig
		           Last name: Federighi
		           Domain: apple
		           Top-Level Domain: com*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ur mail adress ");
		String email = scan.next();
		int indexOfUnderScore = email.indexOf('_');
		int indexOfAt = email.indexOf('@');
		int indexOfPeriot = email.indexOf('.');
		if(email.contains("@")&&email.contains("_")) {
		String firstName = String.valueOf(email.charAt(0)).toUpperCase() + email.substring(1, indexOfUnderScore);
		
		String lastName = String.valueOf(email.charAt(indexOfUnderScore + 1)).toUpperCase()
				+ email.substring((indexOfUnderScore + 2), indexOfAt);
		
		String domain = email.substring((indexOfAt + 1), indexOfPeriot);
		
		String topLevelDomain = email.substring((indexOfPeriot + 1));
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topLevelDomain);
		}else {
			System.out.println(email);
		}

	}

}

