package assignments.day_10_assignment5;

public class Question7 {

	public static void main(String[] args) {

		int num1, num2, num3;
		num1=15;
		num2=255;
		num3=36;
		//checking num1 is a middle number or not
	    if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
	        System.out.print(num1+" is a middle number");
	    }
	    //checking num2 is a middle number or not
	    if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
	        System.out.print(num2+" is a middle number");
	    }
	    //checking num3 is a middle number or not
	    if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
	        System.out.print(num3+" is a middle number");
		}
	}
}
