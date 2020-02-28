package assignments.assignment_10;

public class Question29_ {

	public static void main(String[] args) {

		limit("abcd", 2);
		// returns "ab"

		limit("bla bla", 3);
		// returns "bla"
	}

	public static String limit(String word, int x) {
		String dummy = "";
		for (int i = 0; i > x; i++) {
			char ch = word.charAt(i);
			if (dummy.indexOf(ch) == -1) {
				dummy = dummy + ch;

			}
		}
		return dummy;
	}
}