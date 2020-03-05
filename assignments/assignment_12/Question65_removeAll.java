package assignments.assignment_12;

import java.util.ArrayList;

public class Question65_removeAll {

	public static void main(String[] args) {

//Create a method that is called removeAll takes two parameters: an ArrayList of Strings called wordList, 
//and a String called targetWord and returns nothing
//This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.		
		
		
		ArrayList<String> wordList1 = new ArrayList<String>();
		
		wordList1.add("C++");
		wordList1.add("java");
		wordList1.add("Eclips");

		removeAll(wordList1, "java");
	}

	public static void removeAll (ArrayList<String> wordList, String targetWord ) {
		
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equals(targetWord)) {
				wordList.remove(i);
			}
		}
		System.out.println(wordList);
	}
}