package assignments.day_14_assignment7;

public class Question6 {

	public static void main(String[] args) {

//		1
//		2 6
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15

		for (int i = 1; i <= 5; i++) {
			String str = "";
			int num = i;

			for (int j = 1; j <= i; j++) {

				str = str + (num) + " ";
				num = num + 5 - j;
			}
			System.out.println(str);
		}
	}
}
