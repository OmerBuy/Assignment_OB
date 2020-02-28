package assignments.assignment_9;

import java.util.Scanner;

public class Question7_FirstHalfString {
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ur word ");
		String str = input.nextLine();
		if(str.length()%2==0)
		{
		String new_string = str.substring(0,str.length()/2);
		System.out.println("Half of word is "+new_string);
		}
		else
		System.out.println("Ur word is not even");
		}

}

