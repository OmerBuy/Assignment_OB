package assignments.day_9_assingment4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your post weight: ");
	    int weight = sc.nextInt();
				
		if(weight<=2) {	System.out.println("Your price is $1.10");	
		}else if(weight>2 & weight<=6) {
			System.out.println("Your price is $2.20");
		}else if(weight>6 & weight<10) {
			System.out.println("Your price is $3.70");
		}else if(weight==10) {
			System.out.println("Your price is $3.80");}
		else {System.out.println("No posting");}
		sc.close();
			
		}

}


