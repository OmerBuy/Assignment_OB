package assignments.assignment_12;

import java.util.Arrays;

public class Question70_lastElement {

	public static void main(String[] args) {
		// Switch the last element in an array with the first and return the array.

		int[] list = {99,40,50,3,1};

		System.out.println(Arrays.toString(do_switch(list)));

	}

	public static int[] do_switch(int[] arr) {

		int dummy = arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=dummy;
		
		return arr;
	}

}
