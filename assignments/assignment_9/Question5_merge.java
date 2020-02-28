package assignments.assignment_9;

import java.util.Scanner;

public class Question5_merge {

	public static void main(String[] args) {
//		You have 2 words, both of them have 3 characters. If either of them does not have exactly 3 characters, 
//		print "cannot merge" Merge their characters one by one and print together like below:
//			Sample Output:
//			     aok
//			     lol
//			     alookl
//
//			     ear
//			     pie
//			    epaire
//
//			    java
//			    wow
//			    cannot merge
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1.word... ");
		String word1 = scan.next();
		System.out.print("Enter 2.word... ");
		String word2 = scan.next();
		String result = "";
		if (word1.length() == 3 && word2.length() == 3) {
			for (int i = 0; i < 3; i++) {
				result += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
			}
			System.out.println("Ur words merge is... "+result);
		} else {
			System.out.println("cannot merge");
		}

	}

}
