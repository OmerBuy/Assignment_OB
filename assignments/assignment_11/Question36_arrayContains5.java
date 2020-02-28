package assignments.assignment_11;

public class Question36_arrayContains5 {

	public static void main(String[] args) {
		
		int x[]= {1, 5, 5, 1, 1};
		
		System.out.println(arr(x));
		
	}

	public static boolean arr(int[] nums) {
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (nums[i] == 5 && nums[i + 1] == 5)
				return true;
		}
		return false;
	}

}


	