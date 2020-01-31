package assignments.day_9_assingment4;

public class Question5 {

	public static void main(String[] args) {
	
		int  year=1990;
		int month=6;
		int day=10;
		System.out.println(month+"/"+day+"/"+(year-1900));
		if((year-1900)==month*day) {
			System.out.println("date is magic");
		}
		else if ((year-1900)!=month*day) {
			System.out.println("date is not magic");
		}
		}
		
		
		
	}

