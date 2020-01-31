package assignments.day_9_assingment4;

public class Question10 {

	public static void main(String[] args) {
		
		double calorie=900;
		double fat=10;
		double fcalorie=90;
		fcalorie=fat*9;
		//fcalorie/calorie==percentage
		if(fcalorie<calorie*0.3) {System.out.println("indicating the food is low in fat.");			
		}
		else if (fcalorie>calorie) {
			System.out.println("input is invalid");
		}

	}

}
