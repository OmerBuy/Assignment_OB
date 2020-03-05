package assignments.assignment_12;

import java.util.Arrays;
import java.util.Scanner;

public class Question56_leftShift {

	public static void main(String[] args) {
//		Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
//		Example: 
//		input: 6, 2, 5, 3
//		output: [2, 5, 3, 6]
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		int[] newNums = new int[size];

		newNums[newNums.length - 1] = nums[0];
		for (int j = 0; j < nums.length - 1; j++) {
			newNums[j] = nums[j + 1];
		}

		System.out.println(Arrays.toString(newNums));
	}

}
