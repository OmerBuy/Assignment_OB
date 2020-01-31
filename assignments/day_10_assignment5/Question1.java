package assignments.day_10_assignment5;

public class Question1 {

	public static void main(String[] args) {

		int numberOfBedrooms = 10;
		double startingPrice = 0;

		if (numberOfBedrooms == 1) {
				System.out.println("One Bedroom Selected");
				startingPrice = 1100;
			}else if(numberOfBedrooms == 2) {
				System.out.println("Two Bedroom Selected");
				startingPrice = 1850;
			}else if(numberOfBedrooms == 3) {
				System.out.println("Three Bedroom Selected");
				startingPrice = 2550;
			}else System.out.println("No such Bedrooms available"+"\nStarting Price: value");
		
	}
}