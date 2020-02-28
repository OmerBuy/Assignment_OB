package assignments.assignment_11;

import java.util.Arrays;

public class Question50_lastElement {

	public static void main(String[] args) {

		int[] no= {4,5,6};
		
		System.out.println(Arrays.toString(lastElement(no)));
		
	}
	public static int[] lastElement(int[] nums) {
	    int[] arr = new int[2 * nums.length];
	    arr[arr.length - 1] = nums[nums.length - 1];
	    return arr;
	}
}
