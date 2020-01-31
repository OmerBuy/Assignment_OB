package assignments.day_9_assingment4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pound, bmi, cm, kg;
		int feet, inch;
		String result =null;
		System.out.print("Feet: ");
		feet = sc.nextInt();
		System.out.print("Inch: ");
		inch = sc.nextInt() ;
		System.out.print("Pound: ");
		pound = sc.nextDouble();
		cm = 30.48 * feet + inch * 2.54;
		kg = pound * 0.45;
		bmi = 10000 * kg / (cm * cm);

		if (bmi < 18.5) {
			result = "Underweight";

		} else if (bmi >= 18.5 && bmi < 25) {
			result = "Normal Weight";
		} else if (bmi >= 25 && bmi < 30) {
			result = "Overweight";
		} else if (bmi >= 30) {
			result = "Obese";
		}

		System.out.println("Your weight in pounds: " + pound);
		System.out.println("Your height in feet followed by a space then additional inches: " + feet + " " + inch);
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your risk factory is " + result);
		sc.close();
	}

}
