package Samples;

import java.util.Arrays;

public class Q4 { //seperateEvenAndOddArray 

	public static void main(String[] args) {
		
		int nums[] = { 20, 12, 23, 17, 7, 8, 10, 2, 1, 0 };

		int first = 0;
		int last = nums.length - 1; // POINTERS

		while (first < last) { // I do not know how many times i loop it so i used while loop

			if (nums[first] % 2 == 0) {
				first++;
			}
			if (nums[last] % 2 == 1) {
				last--;
			}
			if (nums[first] % 2 != 0 && nums[last] % 2 != 1) {
				int temp = nums[last];
				nums[last] = nums[first]; // SWAP
				nums[first] = temp;
				first++;
				last--;
			}
		}
		System.out.println(Arrays.toString(nums));
		// OUTPUT = [20, 12, 0, 2, 10, 8, 7, 17, 1, 23]

	}

}
