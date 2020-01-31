package assignments.day_10_assignment5;

public class Question2 {

	public static void main(String[] args) {
		int num1 = 55;
		int num2 = 99;
		if (num1 == num2) {
			System.out.println("num1 =" + num1);
			System.out.println("num2 =" + num2);
			System.out.println(num1 + " and " + num2 + "are equal");
		} else {
			if (num1 > num2) {
				System.out.println("num1 =" + num1);
				System.out.println("num2 =" + num2);
				System.out.println(num1 + " is greater than " + num2);
			} else {
				System.out.println("num1 =" + num1);
				System.out.println("num2 =" + num2);
				System.out.println(num2 + " is greater than " + num1);
			}

		}

	}
}
