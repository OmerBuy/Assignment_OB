package assignments.assignment_12;

import java.util.ArrayList;

public class Question66_appendPosSum {

	public static void main(String[] args) {
//Create a method that is called appendPosSum takes one parameter:an ArrayList of Integers and returns an ArrayList of Integers
//This method should: Create a new ArrayList of Integers
//Add only the positive Integers to the new ArrayList
//Sum the positive Integers in the new ArrayList and add the Sum as the last element
//For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), 
//with 14 being the sum of (4,3,4,3). The original ArrayList should remain unchanged.
		
		ArrayList <Integer> ints = new ArrayList<Integer>();
		ints.add(4);
		ints.add(-6);
		ints.add(3);
		ints.add(-8);
		ints.add(0);
		ints.add(4);
		ints.add(3);
		System.out.println(appendPosSum(ints));
	}
	public static ArrayList <Integer> appendPosSum(ArrayList <Integer> list) {
		ArrayList <Integer> newList= new ArrayList <Integer>(list);
		
		int sum=0;
		for (int i=0,j=0; i<list.size();i++,j++) {
			if (list.get(i)>0) {
			sum+= list.get(i);
			}
			if(list.get(i)<1) {
				newList.remove(j);
				j--;
			}
		}
		System.out.println(list);
		newList.add(sum);
		return newList;
	}
}