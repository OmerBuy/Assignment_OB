package assignments.assignment_11;

public class Question34_reverseOrder {

	public static void main(String[] args) {
		
		String s[] = "Java is fun".split(" ");
		String str = "";
		for (int i = s.length - 1; i >= 0; i--) {
			str += s[i] + " ";
		}
		String x[]=str.split(" ");
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		

	}

}  