package Samples;

import java.util.Random;

public class Q3 {

	public static void main(String[] args) {
//		related with Random class and after taking   'n'     (quantity of numbers) numbers from the computer , 
//		program finds the smallest and biggest numbers . then add them to eachothers.
//		I used wrapper classes ( Integer.MAX_VALUE) while finding the biggest and smallest

		
		System.out.println(number(20, 6));
	}

	public static int number(int limitOfNumbers, int quantityOfNumbers) {
		Random rn = new Random();
		int count = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while (true) {
			int number = rn.nextInt(limitOfNumbers);
			System.out.print(number + " ");
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
			count++;
			if (count == quantityOfNumbers) {
				break;
			}
		}
		System.out.println("\n");
		System.out.println("Min number = " + min);
		System.out.println("Max number = " + max);
		return min + max;

	}

}
