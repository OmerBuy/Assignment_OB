package assignments.day_10_assignment5;

public class Question5 {

	public static void main(String[] args) {

		int age=1;
		
		String children;
		
		if(age==2) {children="toddler";}
		else if(age>2 && age<=5) {children="early childhood";}
		else if(age>5 && age<=7) {children="young reader";}
		else if(age>7 && age<=10) {children="elementary";}
		else if(age>10 && age<=12) {children="middle";}
		else if(age==13) {children="impossible";}
		else if(age>13 && age<=16) {children="high school";}
		else if(age>16 && age<=18) {children="scholar";}
		else{children="ineligible";}
		System.out.println("Age : "+age);
		System.out.println("");
		System.out.println(children);
		
	}

}
