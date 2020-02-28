package assignments.assignment_9;

import java.util.Scanner;

public class Question12_WithoutXAndx {

	public static void main(String[] args) {
//		Given a string, if the first or last chars are 'x' or 'X', 
//		return the string without those 'x' or 'X' chars, 
//				otherwise return the string unchanged..
//				Example: 
//				input: xHiX 
//				output: Hi
//
//				Example:
//				input: apple 
//				output: apple

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ur string :");
		String word = scan.next();

		char firstCharacter = word.charAt(0);
		char lastCharacter = word.charAt(word.length() - 1);
		int startingIndex = 0, endingIndex = word.length();

		if (firstCharacter == 'x' || firstCharacter == 'X') {

			startingIndex = 1;
		}
		if (lastCharacter == 'x' || lastCharacter == 'X') {

			endingIndex = word.length() - 1;
		}
		System.out.println(word.substring(startingIndex, endingIndex));

	}

}