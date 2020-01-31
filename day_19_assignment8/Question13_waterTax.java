package assignments.day_19_assignment8;

public class Question13_waterTax {

	public static void main(String[] args) {

		System.out.println(waterTax(151));
	}

	private static double waterTax(double units) {

		double bill;
		if (units <= 50) {
			bill = units * 0.60;
		} else if (units > 50 && units <= 100) {
			bill = units * 0.90;
		} else if (units > 100 && units<=150) {
			bill = (units * 0.90) + 50;
		}else {			
			bill = (units * 0.90) + 100;
		}return bill;
	}

}
