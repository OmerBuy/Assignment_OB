package Lab_2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//		A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 serving in the bag and 
//		that a serving equals 300 calories. write a program that lets the user 
//		enter the number of cookies he or she actually ate and then reports the number of total calories consumed.
		int Cookies;
		int Servings;
		double Calories;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of cookies you ate:");
		Cookies=sc.nextInt();
		
		Servings = (Cookies/40)*10;
		Calories = Servings*300;
		
		System.out.println(Cookies + " cookies equal to " +Calories + " calories");

		
	}

}
