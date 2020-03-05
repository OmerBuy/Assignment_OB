package assignments.assignment_12;

import java.util.Arrays;

public class Question59_merges2arrays {

	public static void main(String[] args) {

//		   mergR([1,2,3],[4,5,6])
//		     returns [1,2,3,4,5,6]

		int[] a = { 1, 2, 3};
		int[] b = { 4, 5, 6};
		int[] c = new int[a.length + b.length];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;
		}
		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j];
		}
		System.out.println(Arrays.toString(c));
	}

}
