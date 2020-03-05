package assignments.assignment_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question67_timesTwo {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,5));
		timesTwo(numbers);
	}

	public static void timesTwo(ArrayList<Integer>nums) {

		for(int value : nums) {
			
			System.out.print(value*2+" ");
		}
		
		
		
		
		
		
	}

}
