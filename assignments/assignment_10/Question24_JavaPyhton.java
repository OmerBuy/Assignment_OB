package assignments.assignment_10;

import java.util.Scanner;

public class Question24_JavaPyhton {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter ur word: ");
		String sentence = scan.nextLine();
		int indexOfJava = -1, countOfJava = 0;
		int indexOfPython = 0, countOfPython = 0;
		boolean result = false;

		for (int i = 0; i < sentence.length(); i++) {
			indexOfJava = sentence.indexOf("java", i);

			if (indexOfJava != -1) {
				i += indexOfJava;
				countOfJava++;
			}
		}
		for (int i = 0; i < sentence.length(); i++) {
			indexOfPython = sentence.indexOf("python", i);

			if (indexOfPython != -1) {
				i += indexOfPython;
				countOfPython++;
			}
		}
		if (countOfJava == countOfPython) {
			result = true;
			System.out.println(result);
		}else {
			System.out.println(false);
		}
		
	}
}
