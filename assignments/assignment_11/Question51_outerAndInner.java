package assignments.assignment_11;

import java.util.Arrays;

public class Question51_outerAndInner {

	public static void main(String[] args) {

		int[] outer= {1,2,5,9};
		int[] inner= {5,9};
	  
		System.out.println(linearIn(outer,inner));
		
	}
	public static boolean linearIn(int[] outer, int[] inner) {
	    int i = 0;
	    int j = 0;
	      
	    while(i < inner.length && j < outer.length) {
	        if(inner[i] > outer[j]) {
	            j++;
	        } else if(inner[i] < outer[j]) {
	            return false;
	        } else {
	            i++;
	        }
	    }
	                                              
	    if(i != inner.length)
	        return false;
	                                                      
	    return true;
	}
}
