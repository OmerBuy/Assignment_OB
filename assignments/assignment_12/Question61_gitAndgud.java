package assignments.assignment_12;

import java.util.ArrayList;

public class Question61_gitAndgud {

	public static void main(String[] args) {

		ArrayList<String> inputs = new ArrayList<>();
		
		inputs.add("pencil");
		inputs.add("window");
		inputs.add("table");
		inputs.add("chair");
		
		words(inputs);
		
	}

	public static void words(ArrayList<String> arr) {
		
		arr.add(0,"git");
		arr.add(2,"gud");
	
		System.out.println(arr);
	}
}
