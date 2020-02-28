package assignments.assignment_10;

public class Question25_merge2String {

	public static void main(String[] args) {
		
		String s1= "12345";
		String s2= "abcdeasca";
		
		System.out.println(mixString(s1,s2));
	}

	public static String mixString(String a, String b) {

		String dummy = "";
		int x = 0;

		if (a.length() >= b.length()) {
			x = a.length();
		} else
			x = b.length();

		for (int i = 0; i < x; i++) {
			if (i < a.length()) {
				dummy += a.charAt(i);
			}
			if (i < b.length()) {
				dummy += b.charAt(i);
			}
		}
		return dummy;
	}
}
