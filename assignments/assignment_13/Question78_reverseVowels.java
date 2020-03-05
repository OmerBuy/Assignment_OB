package assignments.assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question78_reverseVowels {

	public static void main(String[] args) {

		// Reverse a vowels of string without affecting any other characters. Write a
		// method reverseVowels() that will return a string with reversed vowels.
		
		String word1 = "apple";
	
		System.out.println("Word : " + word1);
		System.out.println(reverseVowels(word1));
	}

	public static String reverseVowels(String word) {

		String[] vowels = { "a", "e", "i", "o", "u" };
		String[] wordArr = word.split("", word.length());
		ArrayList<Integer> indexes = new ArrayList<>();
		ArrayList<String> vowelsInText = new ArrayList<>();
		String output = "";

		for (int i = 0; i < wordArr.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (wordArr[i].equalsIgnoreCase(vowels[j])) {
					vowelsInText.add(wordArr[i]);
					indexes.add(i);
				}
			}
		}
		for (int i = 0; i < indexes.size(); i++) {
			wordArr[indexes.get(i)] = vowelsInText.get(indexes.size() - 1 - i);
		}
		for (int i = 0; i < wordArr.length; i++) {
			output += wordArr[i];
		}
		return output;
	}
}