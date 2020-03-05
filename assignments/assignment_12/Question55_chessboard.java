package assignments.assignment_12;

import java.util.Arrays;

public class Question55_chessboard {

	public static void main(String[] args) {

//		Given a 8x8 two-dimensional array of strings named chessboard. 
//		Initialize values inside an array accordingly to the chess board. 
//		So first element in the array, chessboard[0][0] should have a value "1a", 
//		and last element in the array, chessboard[7][7] should have a value "8h". 

		String[][] chessBoard = new String[8][8];

		int countNum = 1;
		for (int i = 0; i < chessBoard.length; i++) {
			int countLetter = 97;
			for (int j = 0; j < chessBoard.length; j++) {
				char ch = (char) countLetter;
				chessBoard[i][j] = Integer.toString(countNum) + ch;

				countLetter++;

			}
			countNum++;
		}

		System.out.println(Arrays.deepToString(chessBoard));

	}
}
