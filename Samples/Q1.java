package Samples;

public class Q1 {

	public static void main(String[] args) {
		// It asks us to find the duplicate character in the given String

		String str = "Today weather is sunny and 11000 degree. It is a perfect day to practice Java";
		String character = "";
		String Duplicate = "";
		
		for (int i = 0; i < str.length(); i++) { // for loob starting
			String current = Character.toString(str.charAt(i)); // converting each char to string
			
			// we can also use String.valueOf(char) method
			if (character.contains(current)) {

				if (!Duplicate.contains(current)) {

					Duplicate += current + ",";
				}
			}
			character += current;
		} // for loob ending
		System.out.println(Duplicate);
	}

}
