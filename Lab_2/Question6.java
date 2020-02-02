package Lab_2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount of a purchase: ");

		int amount = sc.nextInt();

		double theStateTax=amount*0.04;

		double theCountryTax =amount*0.02;

		double totalTax= theCountryTax + theStateTax;

		double totalSale=totalTax + amount;

		System.out.println("The amount of the purchased: " + amount + "\n" +"The state of tax: " + theStateTax + "\n" +"The country of tax: " + theCountryTax + "\n" +"The total of tax: " + totalTax + "\n" +"Total sale: " + totalSale);
	}

}

