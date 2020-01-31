package assignments.day_13_assignment6;

public class Question9 {

	public static void main(String[] args) {
//		Print following chessboard using nested for loops.
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//
//		NOTE:
//		1. Total 8 rows and 8 columns.
//		2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.

		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 4; j++) {
				if(i%2==1) {
					System.out.print(" W B");
				}else {
			System.out.print(" B W");}
		}
			System.out.println();
	}
	}}

