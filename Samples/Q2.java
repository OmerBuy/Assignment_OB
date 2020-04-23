package Samples;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {

//		sort the array like: first the biigest number than the smallest, after that write the second biggest number and 
//		the second smallest number and go on. Actually i plan to share everyday one code If it makes you confused 
//		i can not share anymore, does not matter please do not hesitate to tell to me.   
//		input:  {90, 100, 80,60,70,40,10}              output:[100, 10, 90, 40, 80, 60, 70]

		int[] nums = { 100, 90, 80, 70, 60, 40, 10 }; // 10 40 60 70 80 90 100
		
		Arrays.sort(nums);
		int temp[] = new int[nums.length];
		boolean flag = true;
		int first = 0;
		int last = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (flag) {
				temp[i] = nums[last];
				last--;
			} else {
				temp[i] = nums[first];
				first++;
			}
			flag = !flag;

		}

		System.out.println(Arrays.toString(temp));

	}

}
