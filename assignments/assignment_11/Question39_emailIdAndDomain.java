package assignments.assignment_11;

import java.util.Scanner;

public class Question39_emailIdAndDomain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		
		int indexOfAt = email.indexOf('@');
		
		
		String Emailid = email.substring(0, indexOfAt);
		
		String domain = email.substring((indexOfAt + 1), email.length());
		
		
		
		System.out.println("email: " + email);
		System.out.println("Print: ");
		System.out.println("Email id : "+Emailid);
		System.out.println("Email Domain: " + domain);

	}


}
//email -> info@cybertekschool.com
//Print:
//Email id: info
//Email domain: cybertekschool.com