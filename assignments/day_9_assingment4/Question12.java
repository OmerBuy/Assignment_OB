package assignments.day_9_assingment4;

public class Question12 {

	public static void main(String[] args) {
//		Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour
//
//		Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour
//
//		Package C: For $19.95 per month unlimited access is provided	
	String internet;
	internet="a";	//Choose ur internet package
	int hour=15;		//enter ur hour
	double bill = 0;
	switch(internet) {
	case "a":
		if(hour<=10) {bill=9.95;
		}else if(hour>10) {bill=9.95+(hour-10)*2;			
		}break;
	case "b":
		if(hour<=20) {bill=13.95;		
		}else if(hour>20) {bill=13.95+(hour-20)*1;
		}break;
	case "c":
		{bill=19.95;
		}break;
		}System.out.println("Your package bill is "+bill);
		
	}
}
