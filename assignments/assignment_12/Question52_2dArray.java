package assignments.assignment_12;

import java.util.Scanner;

public class Question52_2dArray {

	public static void main(String[] args) {

		 Scanner inp = new Scanner(System.in);
		 int rows = inp.nextInt(), cols = inp.nextInt();
		 int[][] arr = new int[rows][cols];
		 for(int i=0 ;i<=rows-1;i++)
		  {
		 for(int j=0 ;j<=cols-1;j++)
		  {
		 arr[i][j]=inp.nextInt();
		   }
		  }
			    
		 int matches = 0;
			for (int k=0; k<rows; k++) {
			for (int l=0; l<cols-1; l++) {
			if (arr[k][l]==arr[k][l+1]) {
			matches++;	
			}
			}
			  }
			System.out.print("matches: "+matches);
			
		}

	}