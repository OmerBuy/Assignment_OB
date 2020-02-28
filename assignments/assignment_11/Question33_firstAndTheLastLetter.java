package assignments.assignment_11;

public class Question33_firstAndTheLastLetter {

	public static void main(String[] args) {

		String[] arr = { "hello", "why", "by", "apple", "note" };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].charAt(0));
			System.out.print(arr[i].charAt(arr[i].length()-1) );
			System.out.println();

		}

	}
}
