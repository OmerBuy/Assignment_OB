package assignments.assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Question46_shortestWordsAgain {

	public static void main(String[] args) {

	//	String input[] = { "olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray" };
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ur input: ");
		String str = scan.nextLine();
		String[] words = str.split(", ");
		String shortest = words[0];
		for (String s : words) {
			if (shortest.length() > s.length()) {
				shortest = s;
			}
		}
		int counter = 0;
		for (String s : words) {
			if (shortest.length() == s.length()) {
				counter++;
			}
		}
		String[] shortWords = new String[counter];
		for (int i = 0, j = 0; i < words.length; i++) {
			if (shortest.length() == words[i].length()) {
				shortWords[j] = words[i];
				j++;
			}
		}

		Arrays.sort(shortWords);

		System.out.println(Arrays.toString(shortWords));
	}
}