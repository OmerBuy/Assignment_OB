package assignments.assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Question47_zombie {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];

	    for(int i=0; i<inhabitants.length; i++) {
	        inhabitants[i] = input.nextInt();
	    }

	    int day = 0;
	    System.out.println("Day " + day + " "+ Arrays.toString(inhabitants));
	    for (int i = inhabitants.length/2; i <= inhabitants.length-2; i++) {
	        for (int j =0; j < inhabitants.length; j++) {
	            inhabitants[j] /= 2;
	        }
	        day++;
	        System.out.println("Day " + day + " "+ Arrays.toString(inhabitants));
	    }

	    System.out.println("---- EXTINCT ----");
	  }
	}
