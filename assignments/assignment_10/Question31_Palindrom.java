package assignments.assignment_10;

import java.util.Scanner;

public class Question31_Palindrom {

	public static void main(String[] args) {

		/*isPalindrome("Noon") ==> true
		isPalindrome("I am not palindrome") ==> false
		isPalindrome("wooden") ==> false
		isPalindrome("Nurses Run") ==> true*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ur word : ");
		String word = scan.nextLine();
		boolean result = false;
		String reversed = "";

		word = word.toLowerCase().replace(" ", "");

		for (int i = word.length() - 1; i >= 0; i--) {

			reversed += String.valueOf(word.charAt(i));
		}
		if (word.equals(reversed)) {

			result = true;
		}
		System.out.println(result);
	}

}
