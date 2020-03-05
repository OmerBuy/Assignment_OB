package assignments.assignment_13;

import java.util.ArrayList;

public class Question72_Refuel_times {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(10);

		int max_fuel = 10;

		System.out.println(refuel_times(list, max_fuel));
	}

	public static int refuel_times(ArrayList<Integer> list, int max_fuel) {
		
		int fuelStop = 0;
		int sum = 0;
		for (Integer value : list) {
			sum += value;
		}
		if (sum % max_fuel == 0) {
			return sum / max_fuel;
		} else {
			return sum / max_fuel + 1;
		}
	}
}
