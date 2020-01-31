package assignments.day_4;

public class Question5 {

	public static void main(String[] args) {

		int hour, minute, second, inputSecond;
		inputSecond = 3695;
		second = inputSecond % 60;
		minute = inputSecond / 60;
		minute = minute % 60;
		hour = minute / 60;
		

		System.out.println("inputSecond is " + inputSecond + "\n" + hour + "hours," + minute + "minutes, and " + second
				+ " seconds");

	}

}
