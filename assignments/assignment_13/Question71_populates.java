package assignments.assignment_13;

import java.util.Arrays;

public class Question71_populates {

	public static void main(String[] args) {

		int[] list = new int[5];
		System.out.println(Arrays.toString(populate(list)));
	}

	public static int[] populate(int[] arr) {
		
		for(int i =1;i<=arr.length;i++) {
			arr[i-1]=i;
		}
		
		return arr;
		
	}
}
