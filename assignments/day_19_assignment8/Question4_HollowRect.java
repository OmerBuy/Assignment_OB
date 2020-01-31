package assignments.day_19_assignment8;

public class Question4_HollowRect {

	public static void main(String[] args) {

		printHollowRect(5);
	}

	public static void printHollowRect(int x) {

		for (int j = 1; j <= x; j++) {
			if (j == 1 || j == x) {
				for (int i = 1; i <= x; i++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for (int i = 1; i <= x; i++) {
					if (i == 1 || i == x) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

	}

}
