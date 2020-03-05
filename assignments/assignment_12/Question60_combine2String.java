package assignments.assignment_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question60_combine2String {

	public static void main(String[] args) {
//		combine two String arrays into one arraylist and return it as a string.

		String [] input1 = {"f","o","o"};
		String [] input2 = {" b","a","r"};
		
		String [] input3 = {"1","2","3"};
		String [] input4 = {"4"};
		
		System.out.println(combine2Str(input1, input2));
		System.out.println(combine2Str(input3, input4));
		
	}
	public static String combine2Str(String []arr1, String []arr2) {
		
		ArrayList<String> combined = new ArrayList<>();
		
			for(int i = 0; i<arr1.length; i++) {
				combined.add(arr1[i]);
			}
			for(int i = 0; i<arr2.length; i++) {
				combined.add(arr2[i]);
			}
	return String.join("", combined);
	}
}