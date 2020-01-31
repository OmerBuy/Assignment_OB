package assignments.day_9_assingment4;

public class Question11 {

	public static void main(String[] args) {
		int distance=55;
		String medium = "water";    //Choose one of them : steel,water,air
		switch (medium) {
		case "air":
			System.out.println("Air Travel time is: " + (double) distance / 1100 + " seconds");
			break;
		case "water":
			System.out.println("Water Travel time is: " + (double) distance / 4900 + " seconds");
			break;
		case "steel":
			System.out.println("Steel Travel time is: " + (double) distance / 16400 + " seconds");
			break;
		default:
			break;

	
		}
		
		
		
		
		
	}

}
