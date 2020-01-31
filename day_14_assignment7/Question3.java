package assignments.day_14_assignment7;

public class Question3 {

	public static void main(String[] args) {

		for (int j = 1; j <= 7; j++) {
			for (int k = j; k > 1; k--) {
				System.out.print(" ");}
			for (int i = j; i <= 7; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int j = 6; j >= 1; j--) {
			for (int k = j; k > 1; k--) {
			System.out.print(" ");}
			for (int i = j; i <= 7; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
		
	}

}
