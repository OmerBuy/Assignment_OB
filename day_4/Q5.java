package assignments.day_4;

public class Q5 {

	public static void main(String[] args) {
// Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

//-Declare int variables inputSeconds, hours, minutes, seconds
//-Initialize the inputSeconds
//
//-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
//-Assign values to the hours, minutes, seconds variables
//-Display the result
//
//       Sample Output:
//
//       inputSecond is 3695
//
//      1 hours, 1 minutes, and 35 seconds

		int inputSeconds, hours, minutes, seconds;

		inputSeconds = 3695;
		seconds = inputSeconds % 60;
		minutes = inputSeconds / 60;
		minutes = minutes % 60;
		hours = minutes / 60;

		System.out.println(inputSeconds+" seconds is \n"+hours+" hours "+minutes+" minutes "+seconds+" seconds");
	}

}
