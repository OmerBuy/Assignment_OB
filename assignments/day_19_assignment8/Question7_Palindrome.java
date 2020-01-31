package assignments.day_19_assignment8;

import java.util.Scanner;

public class Question7_Palindrome {

	public static void main(String[] args) {

		
		Palindrome();
		
	}

	private static boolean Palindrome() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    
	    int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        
        // reversed integer is stored in variable 
        
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
       
        // palindrome if orignalInteger and reversedInteger are equal
       
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
       
        sc.close();
        return originalInteger == reversedInteger; 

        
	}
	
}
