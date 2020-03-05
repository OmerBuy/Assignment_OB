package assignments.assignment_12;

import java.util.Arrays;
import java.util.Scanner;

public class Question58_biggestNumber {

	public static void main(String[] args) {
//		Given a 2d array of ints, find the biggest number(integer) and replace all array values on the biggest number 
		// in the array then print an array.
//		Sample Output:
//		     Given values: [[1, 2, 3], [5, 33, 9]]
//		     output: [[33, 33, 33], [33, 33, 33]]
//		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter row number : ");
		int rows = inp.nextInt();
		System.out.print("Enter column number : ");
		int	cols = inp.nextInt();
		
		System.out.print("Enter numbers : ");
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		// TODO write your code below

		int maxArr = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maxArr) {
					maxArr = arr[i][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = maxArr;
			}
		}

		// FINAL PRINT
		System.out.println(Arrays.deepToString(arr));
	}
}
