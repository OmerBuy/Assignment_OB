package assignments.day_19_assignment8;

public class Question6_next3 {

	public static void main(String[] args) {

		next3(8);
	}

	private static void next3(int i) {
		System.out.print("next 3 are: ");
		for (int j = 1; j < 4; j++) {
			System.out.print(++i + " ");
		}
	}
}
