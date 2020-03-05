package assignments.assignment_12;

import java.util.ArrayList;

public class Question62_sumOfInts {

	public static void main(String[] args) {

		ArrayList<Integer> input = new ArrayList<>();
		
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		
		System.out.println(input);
		System.out.println(Sumofinput(input));
		
		
	}

	public static int Sumofinput(ArrayList<Integer> numbers) {
		
		int sum=0;
		for(int i : numbers) {
			sum=sum+i;
		}
		return sum;		
		
	}
}
