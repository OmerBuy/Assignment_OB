package assignments.assignment_11;

import java.util.Arrays;

public class Question38_countOfEvenNum {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 2, 4, 9 };
		int counter = 0;
		System.out.println("Original Array: " + Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				counter++;
			}
		}
		System.out.printf("\nNumber of even elements in the array: " + counter);
	}
}
