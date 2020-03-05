package assignments.assignment_12;

import java.util.ArrayList;

public class Question63_removeFirst2 {

	public static void main(String[] args) {
		
		ArrayList<Double> doubles= new ArrayList<>();
		
		doubles.add(1.1);
		doubles.add(2.2);
		doubles.add(3.3);
		doubles.add(4.4);
		doubles.add(5.5);
		
		System.out.println(doubles);
		System.out.println(removeFirstTwo(doubles));
	}
	public static ArrayList<Double> removeFirstTwo(ArrayList<Double> doubles) {
		
		doubles.remove(0);
		doubles.remove(0);
		
		return doubles;
		
	}
}
