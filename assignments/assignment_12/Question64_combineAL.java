package assignments.assignment_12;

import java.util.ArrayList;

public class Question64_combineAL {

	public static void main(String[] args) {

//Create a method that is called combineAL takes two parameters: an ArrayList of Strings called wordList1, 
//and an ArrayList of Strings called wordList2 and returns an ArrayList
//This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, 
//then add all the words (in order) from wordList2. In other words, it is combining all the elements from the two parameters.

	
		ArrayList<String> inputs = new ArrayList<>();
		
		inputs.add("pencil");
		inputs.add("window");
		inputs.add("table");
		inputs.add("chair");
		
		ArrayList<String> inputs2 = new ArrayList<>();
		
		inputs.add("book");
		inputs.add("eraser");
		inputs.add("door");
		inputs.add("plane");
		
		System.out.println(combineAL(inputs, inputs2));
	
	
	
	}

	private static ArrayList<String> combineAL(ArrayList<String>wordList1,ArrayList<String>wordList2) {
		
		ArrayList<String> addAll = new ArrayList<>();
		
		addAll.addAll(wordList1);
		addAll.addAll(wordList2);
		
		return addAll;
	}

}
