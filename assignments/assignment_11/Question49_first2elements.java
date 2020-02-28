package assignments.assignment_11;

import java.util.Arrays;

public class Question49_first2elements {

	public static void main(String[] args) {
		
		int[] no= {1,2,3,4};
		
		System.out.println(Arrays.toString(twoPiece(no)));
		
		
	}
	public static int[] twoPiece(int[] nums){
	
		int[] front;
		if(nums.length >= 2)
		{
			front = new int[2];
			front[0] = nums[0];
			front[1] = nums[1];
		}
		else if(nums.length == 1)
		{
			front = new int[1];
			front[0] = nums[0];
		}
		else
			front = new int[0];
		return front;
	}
}
