package assignments.assignment_9;

import java.util.Scanner;

public class Question14_CarInsurance {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");

		/*
		 * Display message: Welcome to the CountyFarm car insurance! Display message:
		 * Enter your name input from user: David Display message: Do you have a US
		 * driver license? input from user: Yes Display message: Enter your zip code
		 * input from user: 20910 Display message: Is this vehicle Owned, Financed, or
		 * Leased? input from user: Owned Display message: How is this vehicle primarily
		 * used? input from user: Pleasure Display message: How old are you? input from
		 * user: 25 Display message: How many years you've been driving? input from
		 * user: 5 Display message: Have you had any accidents in the last 5 years?
		 * input from user: No Display message: Have you had continuous insurance for
		 * the past 12 months? input from user: Yes Display message: What is the highest
		 * level of education you have completed? input from user: PhD Display message:
		 * David, here's your quote! Display message: Start Your Policy Today For:
		 * $52.25 Display message: Reference number: DA25ID20910PHD
		 */

		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		if (scan.nextLine().equalsIgnoreCase("yes")) {
			System.out.println("Enter your zip code");
			int zipCode = scan.nextInt();
			scan.nextLine();
			/*
			 * If zip code equals to 20910 or 20740, add $60 to the premium (an amount to be
			 * paid for an insurance policy). If zip code equals to 22102 or 22103, add $30
			 * to the premium. Otherwise add $50 to the premium.
			 */
			if (zipCode == 20910 || zipCode == 20740) {
				premium += 60;
			} else if (zipCode == 22102 || zipCode == 22103) {
				premium += 30;
			} else {
				premium += 50;
			}
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.nextLine();
			/*
			 * Then ask user about car ownership. Display message:
			 * "Is this vehicle Owned, Financed, or Leased?". If car is owned, add $10 to
			 * the premium, otherwise add $20 to the premium.
			 */
			if (vehicleOwnership.equalsIgnoreCase("owned")) {
				premium += 10;
			} else {
				premium += 20;
			}

			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.nextLine();
			/*
			 * Then ask user about car usage. Display message:
			 * "How is this vehicle primarily used?". If car used for Business, add $50 to
			 * the premium. If car for Pleasure add $10 to the premium. If car is for
			 * Commute - add $20 to the premium,
			 */
			if (vehicleUsage.equalsIgnoreCase("business")) {
				premium += 50;
			} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
				premium += 10;

			} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
				premium += 20;
				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool = scan.nextInt();
				scan.nextLine();
				premium += daysDrivenToWorkOrSchool * 5;
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool = scan.nextInt();
				scan.nextLine();
				premium += milesToWorkOrSchool * 1;

			}
			System.out.println("How old are you?");
			/*
			 * If age is less than 16, display message: "Invalid data!", and stop the
			 * program. If age is between 16 and 18 (exclusive), multiply premium by 20. If
			 * age is between 18 (inclusive) and 21 (inclusive), multiply premium by 6. If
			 * age is between 21 (exclusive) and 25 (exclusive), multiply premium by 2.
			 */
			int age = scan.nextInt();
			if (age < 16) {
				System.out.println("Invalid data!");
				System.exit(0);

			} else if (age >= 16 && age < 18) {
				premium += premium * 20;

			} else if (age >= 18 && age <= 21) {
				premium += premium * 6;
			} else if (age > 21 && age < 25) {
				premium += premium * 2;
			}

			/*
			 * Then, ask customer about driving experience. Make sure that experience is
			 * grater than 0 and result of subtraction age from experience is greater than
			 * 16. If no, display message: "Invalid data!" and stop the program.
			 */
			System.out.println("How many years you've been driving?");
			int experience = scan.nextInt();
			scan.nextLine();
			if ((experience + 16) > age || age <= 0) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else {
				premium -= experience * 5;
			}
			System.out.println("Have you had any accidents in the last 5 years?");
			/*
			 * Display message: "Have you had any accidents in the last 5 years?". If answer
			 * equals to "Yes" or "YES", ask customer about amount of accidents. Display
			 * message: "How many?", in order to get information about amount of accidents.
			 * Add 20% to the premium price for every accident.
			 */
			if (scan.nextLine().equalsIgnoreCase("yes")) {
				System.out.println("How many?");
				accidentsAmount = scan.nextInt();
				scan.nextLine();
				premium += (premium / 5) * accidentsAmount;
			}
			/*
			 * Then, ask customer if he had continuous insurance for the past 12 months.
			 * Display message: "Have you had continuous
			 * 
			 * insurance for the past 12 months?". If customer provides negative answer (No)
			 * - double the premium.
			 */
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.nextLine();
			if (continuousInsurance.equalsIgnoreCase("no")) {
				premium = premium * 2;
			}
			System.out.println("What is the highest level of education you have completed?");
			education = scan.nextLine();
			/*
			 * If level of education equals to "PhD" or "Bachelors"or "Masters" - reduce
			 * premium by 5%. If the level of education equals to "Doctors" reduce premium
			 * by 10%. If level of education equals to "Less than High School" increase
			 * premium by 5%.
			 */
			if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("masters")
					|| education.equalsIgnoreCase("bachelors")) {
				premium -= (premium * 0.05);
			} else if (education.equalsIgnoreCase("doctors")) {
				premium -= (premium / 10);
			} else if (education.equalsIgnoreCase("Less than High School")) {
				premium += (premium * 0.05);
			}

			System.out.println(name + ", here's your quote!");
			String educationWithoutSpace = "";
			for (int i = 0; i < education.length(); i++) {
				if (String.valueOf(education.charAt(i)).equals(" ")) {
					continue;
				} else {
					educationWithoutSpace += String.valueOf(education.charAt(i));
				}
			}
			System.out.println(educationWithoutSpace);
			System.out.println("Start Your Policy Today For: $" + premium);
			referenceNumber = (name.substring(0, 2) + Integer.toString(age)
					+ name.substring(name.length() - 2, name.length()) + Integer.toString(zipCode)
					+ educationWithoutSpace).toUpperCase();
			System.out.println("Reference number: " + referenceNumber);
			/*
			 * In order to build reference number variable (referenceNumber), concatenate
			 * first 2 letters of customer's name, age, last 2 letters of of customer's
			 * name, zip code, and level of education without spaces. This value should be
			 * all upper case!
			 */

		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}
	}

}