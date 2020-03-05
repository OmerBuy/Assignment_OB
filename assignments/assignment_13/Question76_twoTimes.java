package assignments.assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question76_twoTimes {

	public static void main(String[] args) {
		// Create a method that is called "twoTimes" takes in a single parameter - an
		// ArrayList of Integers and returns a new ArrayList of Integers
		// This method should create a new ArrayList of Integers that contains every
		// value of the ArrayList parameter repeated twice.

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));
		
		System.out.println(twoTimes(list));
	}

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {

		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			newList.add(list.get(i));
			newList.add(list.get(i));
		}
		return newList;
	}

}
