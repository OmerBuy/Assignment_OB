package assignments.day_19_assignment8;

public class Question16_simpleRoomBook {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(false, 2, 2, 2018));

	}

	public static boolean simpleRoomBook(boolean a, int mount, int day, int year) {
		if (year == 2018) {
			if (a == false || (a == true && july(mount, day) == false)) {
				return false;
			} else
				return true;
		} else
			return false;
	}

	public static boolean july(int mount, int day) {
		if (mount == 7) {
			if (day >= 1 && day <= 7) {
				return false;
			} else
				return true;
		}
		return true;
	}
}
