package assignments.day_19_assignment8;

public class Question15_validateTask {

	public static void main(String[] args) {

		System.out.println(validateTask(true, 2, 1));
	}

	public static boolean validateTask(boolean b, int taskId, int currentId) {

		if (taskId == currentId + 1 && b == true) {
			return true;
		} else {
			return false;
		}
	}
}
