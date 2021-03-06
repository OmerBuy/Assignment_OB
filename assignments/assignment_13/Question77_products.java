package assignments.assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question77_products {

	public static void main(String[] args) {

		// All products that go into the warehouse go through a machine that checks if
		// they are intact. To declare if the shipment of the product was good or bad it
		// also gets a limited number of how many products can be broken for it to be
		// considered a good shipment.
		// badP is a method that gets an int array named products and an int named limit.
		// products(int[]) - is an int array representing the products it checked, if
		// the item is intact it will be represented by 1 if it is broken its 0. for
		// example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.
		// limit(int) - represents the max amount of broken items for this shipment to
		// be considered good (and the method returns true) for example: products
		// [1,1,1,1,0] limit:3, there is only 1 broken product and it is less than the limit (3) return true.

		ArrayList<Integer> products = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0, 0));

		System.out.println(removeInst(products, 3));
	}

	public static boolean removeInst(ArrayList<Integer> products, int limit) {
		int counter = 0;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i) == 0) {
				counter++;
			}
		}
		if (counter < limit) {
			return true;
		}
		return false;

	}

}
