package assignments.assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question74_Remove {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 5, 9));

		System.out.println(removeInst(nums, 2));

	}

	public static ArrayList<Integer> removeInst(ArrayList<Integer> nums, int number) {

		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == number) {
				nums.remove(i);
				i--;
			}
		}
		return nums;
	}
}
