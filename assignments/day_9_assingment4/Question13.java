package assignments.day_9_assingment4;

public class Question13 {

	public static void main(String[] args) {

		int basefee=10;
		int check=19;
		int fee=0;
		
		if(check<20) {
			fee=basefee+check*10;		
		}else if(check>=20 && check<=39){
			fee=basefee+19*10+(check-19)*8;
		}else if(check>=40 && check<=59) {
			fee=basefee+19*10+20*8+(check-39)*6;
		}else{
			fee=basefee+19*10+20*8+20*6+(check-59)*4;}
			System.out.println("Your monthly bank's service fee is " + fee + "$");
			}
		
		}
		
		
		
		
		
		
		
		
		
		



