package assignments.assignment_13;

import java.util.Arrays;

public class Question79_matrix {

	public static void main(String[] args) {
		
		int[][] matrix = { { 1, 2, 3 }, { 3, 4, 5 } };

		System.out.println(Arrays.deepToString(scalar(matrix, 2)));
	}

	public static int[][] scalar(int[][] matrix, int n) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= n;
			}
		}
		return matrix;
	}
}