package assignments.assignment_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question69_repeatAL {

	public static void main(String[] args) {

		ArrayList<Boolean>x=new ArrayList<>(Arrays.asList(true,false,false));
		repeatAL(x);
	}

	public static void repeatAL(ArrayList<Boolean>y) {

		y.addAll(y);
		System.out.println(y);
	}

}
