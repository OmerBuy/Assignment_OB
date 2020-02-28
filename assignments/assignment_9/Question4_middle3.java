package assignments.assignment_9;

import java.util.Scanner;

public class Question4_middle3 {

	public static void main(String[] args) {
//		If the word has odd number of characters and has 5 or more characters, print the middle three characters of the word. Otherwise, print "invalid".
//		Sample Output:
//		       fifteen ==> fte
//		       apple ==> ppl
//		       hey ==> invalid
//		       java ==> invalid
//		      whatsup ==> ats
//		      $ ==> invalid
		Scanner scan = new Scanner(System.in);
		System.out.print("Pls enter ur word...");
		String word = scan.next();

		if (word.length() % 2 != 0 ) {
			if (word.length() >= 5) {
				System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 2));
			} else {
				System.out.println("Invalid. Pls try again");		
			}
		}else {
			System.out.println("Error. Your word has even num of characters");
		}

	}
}
