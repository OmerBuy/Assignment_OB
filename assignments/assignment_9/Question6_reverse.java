package assignments.assignment_9;

import java.util.Scanner;

public class Question6_reverse {

	public static void main(String[] args) {
//		Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
//		If the word is shorter, display message: "Too short!". If the word is longer, display the message: 
//			"Too long!". Otherwise, reverse this word and print out the result into the console.
//		Sample Output:
//		     input: cat
//		     output: Too short!
//
//		     input: singularity
//		     output: Too long!
//
//		     input: apple
//		     output: elppa
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		if (sentence.length() == 5) {
			int i = sentence.length() - 1;
			while (i >= 0) {
				System.out.print(sentence.charAt(i));
				i--;
			}
		} else if (sentence.length() < 5) {
			System.out.println("Too short!");
		} else {
			System.out.println("Too long!");
		}

	}

}
