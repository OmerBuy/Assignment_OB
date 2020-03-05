package assignments.assignment_13;

public class Question80_batsman {

	public static void main(String[] args) {
		// short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		// Above array stores the scores of a batsman in his last 10 innings in the game
		// of cricket.
		// To know more about cricket, you can visit Wikipedia link:
		// https://en.wikipedia.org/wiki/Cricket
		// If the score is greater than or equal to 50 but less than 100, it is regarded
		// as a half-century.
		// If the score is greater than or equal to 100 but less than 200, it is
		// regarded as a century.
		// If the score is greater than or equal to 200, it is regarded as a
		// double-century.
		// NOTE: No scenario of the triple-century in this case.
		// Write the code to print the number of half-centuries, centuries and
		// double-centuries scored by the batsman.
		
		short[] scores = { 51, 85, 32, 0, 98, 157, 82, 101, 64, 249 };

		cricketScores(scores);
	}

	public static void cricketScores(short[] scores) {

		int halfCen = 0, cen = 0, doubleCen = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50 && scores[i] < 100) {
				halfCen++;
			} else if (scores[i] >= 100 && scores[i] < 200) {
				cen++;
			} else {
				doubleCen++;
			}
		}
		System.out.println("Number of half-centuries: " + halfCen);
		System.out.println("Number of centuries: " + cen);
		System.out.println("Number of double-centuries: " + doubleCen);
	}
}