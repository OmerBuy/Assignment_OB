package assignments.day_19_assignment8;

public class Question14_TruthTable {

	public static void main(String[] args) {

		System.out.println("Truth Table:");
		System.out.println("------------");
		System.out.println(threeLocks(true, true, true));
		System.out.println(threeLocks(true, false, true));
		System.out.println(threeLocks(false, false, true));
		System.out.println(threeLocks(true, true, false));
		System.out.println(threeLocks(true, false, true));
	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {

			return (a && b == true) || c == true;
		
	}
}
