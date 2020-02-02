package Lab_2;

import java.util.Scanner;

public class Question1 {

	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ur first number :");
				
		int num = sc.nextInt();
		int max = num;
		int min = num;
				
		for (int yesOrNo = 1; yesOrNo == 1; 
					
			System.out.println("Do you want to enter another number? 1- YES 0-NO"),yesOrNo = sc.nextInt()) {
			System.out.print("Enter ur next number :");
					
			num = sc.nextInt();
			
			if (max < num) {
				max = num;
				}
			if (num < min) {
				min = num;
			}
		}
			System.out.println("Max number : " + max);
			System.out.println("Min number : " + min);
			sc.close();
	}
}

