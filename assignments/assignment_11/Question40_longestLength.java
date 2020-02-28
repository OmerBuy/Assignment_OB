package assignments.assignment_11;

public class Question40_longestLength {

	public static void main(String[] args) {

		String[] words = { "aaa", "bbbbb", "whasstupppp", "longg", "iaaaaavvaaaaaaaaaa" };

		String longestString = getLongestString(words);
		System.out.format(longestString);

	}

	public static String getLongestString(String[] arr) {
		
		int maxLength = 0;
		
		String longestString = "";
		for (String value : arr) {
			if (value.length() > maxLength) {
				maxLength = value.length();
				longestString = value;
			}
		}
		return longestString;
	}
}