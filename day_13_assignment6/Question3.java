package assignments.day_13_assignment6;

public class Question3 {

	public static void main(String[] args) {

		// Write a Java program to print all the numbers between 1 and 100 (including 1
		// and 100) which are divisible by 5.

		for (int num = 1; num <= 100; num++) {
			if (num % 5 == 0) {
				System.out.println(num);
			}
		}
	}
}
