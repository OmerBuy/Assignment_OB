package assignments.assignment_11;

import java.util.Scanner;

public class Question35_reverseASingleLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter ur sentence :");  //Java is fun
		String str= sc.nextLine();

		String s[] = str.split(" ");
		String str1 = "";
		for (int i = s.length - 1; i >= 0; i--) {
			str1 += s[i] + " ";
		}
		System.out.println(str1);

	}

}
