package assignments.day_19_assignment8;

public class Question10_isEven {

	public static void main(String[] args) {

		System.out.println(isEven(16));
	}
	private static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
