
package assignments.day_13_assignment6;

public class Question7 {

	public static void main(String[] args) {

		for (int j = 4; j > 0; j--) {
			for (int k=j;k<4;k++)
				System.out.print(" ");
			for (int i = j; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
}
}
