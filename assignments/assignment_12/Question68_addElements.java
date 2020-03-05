package assignments.assignment_12;

import java.util.Arrays;

public class Question68_addElements {

	public static void main(String[] args) {

		int[]arr1= {10, 40, 50, 3, 1};
		int[]arr2= {11, 0, 500, 44, 1101};
		
		System.out.println(Arrays.toString(addElements(arr1,arr2)));
		
	}

	public static int[] addElements(int[]x,int[]y) {
		int[]z= new int [x.length];
		for(int i = 0;i<x.length;i++) {
			
		z[i]=x[i]+y[i];
		
		}
		return z;

		
		
		
	}

}
