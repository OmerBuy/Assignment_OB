package assignments.assignment_10;

public class Question16_javaAppears {

	public static void main(String[] args) {

		String word = "java";
		System.out.println(javaAppears(word));

	}

	public static boolean javaAppears(String x) {

		if (x.length() >= 4) {

			if (0 == x.indexOf("java", 0) || 1 == x.indexOf("java", 1)) {

				return true;
			}
		}
		return false;

	}
}
