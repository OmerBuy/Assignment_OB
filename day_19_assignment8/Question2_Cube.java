package assignments.day_19_assignment8;

import java.util.Scanner;

public class Question2_Cube {

	public static void main(String[] args) {
		cube();
	}
	public static void cube() {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
		
		int i = sc.nextInt();
		i=i*i*i;
		System.out.println(i);
		sc.close();
	}
}
