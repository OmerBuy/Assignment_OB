package assignments.day_19_assignment8;

public class Question8_Fibonacci {

	public static void main(String[] args) {

		fib(5);
	}

	public static int fib(int i) {
		int sum = 0, n1 = 0, n2 = 1;
		if (i == 1)
			return 0;

		else if (i == 2) {
			return 1;
		} else {

			for (int a = 1; a <= i; a++) {
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
			System.out.print(n2);
			return n2;
		}

	}
}
