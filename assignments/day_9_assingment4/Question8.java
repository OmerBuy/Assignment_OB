package assignments.day_9_assingment4;

public class Question8 {

	public static void main(String[] args) {
		mass(49);
		

	}
	public static void mass(int pack) {
		
		double price = pack * 99;
		
		if (pack < 10) {
			price = pack * 99;
		} else if (pack >= 10 & pack < 20) {
			price = price - (price * 0.2);
		} else if (pack >= 20 & pack < 50) {
			price = price - (price * 0.3);
		} else if (pack >= 50 & pack < 100) {
			price = price - (price * 0.4);
		} else if (pack <= 100) {
			price = price - (price * 0.5);
		}
		System.out.println("Your selling package is " + pack + " and your price is " + price);

	}


}
