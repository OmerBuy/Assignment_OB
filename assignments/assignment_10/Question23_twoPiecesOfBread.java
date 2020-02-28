package assignments.assignment_10;

import java.util.Scanner;

public class Question23_twoPiecesOfBread {

	public static void main(String[] args) {
		

		Bread();
	}

	public static void Bread() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ur word : ");
		String str = scan.next();

		int secondBread = str.lastIndexOf("bread");//11
		int firstBreadending = str.indexOf("bread") + "bread".length();//5

		if (secondBread > firstBreadending) {

			System.out.println(str.substring(firstBreadending, secondBread));

		} else {
			System.out.println("nothing");
		}
		
	}

	
}
