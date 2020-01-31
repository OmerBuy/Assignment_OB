package assignments.day_9_assingment4;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("How many book you bought?");
		int book = sc.nextInt();

		
		if (book==0) {System.out.println("You earn 0 points");}
		else if(book==1) {
			System.out.println("You earn 5 points");}
		else if(book==2) {
			System.out.println("You earn 15 points");}
		else if(book==3) {
			System.out.println("You earn 30 points");}
		else if(book>=4) {
			System.out.println("You earn 60 points");}

		sc.close();
		

	}

}
