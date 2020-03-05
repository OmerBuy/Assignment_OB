package assignments.assignment_13;

public class Question73_currency {

	public static void main(String[] args) {
		// Bob has traveled a lot and has a lot of currency types. He needs a machine
		// that will get currency and convert it into dollars.
		// The machine already gets the money and can categorize it onto type and
		// amount. it also has the current conversion rates. The only thing it needs is
		// a way to calculate all of it into dollars.

		String[][] money = { { "drachma", "11.0" }, { "sek", "5.0" } };
		String[][] rate = { { "drachma", "0.6" }, { "sek", "100" } };

		System.out.println(convertC(money, rate));

	}

	public static double convertC(String[][] money, String[][] rate) {
		double dolar = 0;

		dolar += Double.parseDouble(money[0][1]) * Double.parseDouble(rate[0][1])
				+ Double.parseDouble(money[1][1]) * Double.parseDouble(rate[1][1]);

		return dolar;
	}
}