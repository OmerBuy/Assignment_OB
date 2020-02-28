package assignments.assignment_11;

import java.util.Scanner;

public class Question41_UtopianTree {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter age of tree :");
		int t = x.nextInt();
		int height=0;
		if (t > 0) {
			for (int j = 1; j <= t; j++) {
				if (t <= 3 ) {
					height += 1;
					break;
					}
				else
					height += 2;
				break;
			}
			System.out.println(height);
		}
	}
}