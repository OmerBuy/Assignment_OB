package assignments.assignment_12;

public class Question57_ {

	public static void main(String[] args) {
		// Given a square matrix, calculate the absolute difference between the sums of its diagonals.
		// For example, the square matrix is shown below:
		// 1 2 3
		// 4 5 6
		// 9 8 9
		// The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 =17.
		// Their absolute difference is |15-17| = 2.

		int sumLeft = 0, sumRight = 0;
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };

		for (int i = 0; i < input.length; i++) {
			sumLeft += input[i][i];
			for (int j = 0; j < input.length; j++) {
				if ((i + j) == (input.length - 1)) {
					sumRight += input[i][j];
				}
			}
		}

		System.out.println(Math.abs(sumLeft - sumRight));
	}

}
