package assignments.assignment_11;

public class Question32_firstThreeLetters {

	public static void main(String[] args) {

		String[] arr = { "apple", "orange", "watermelon", "apple", "banana" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].subSequence(0, 3));
		}

	}

}
