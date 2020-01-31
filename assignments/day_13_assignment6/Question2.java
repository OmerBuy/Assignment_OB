package assignments.day_13_assignment6;

public class Question2 {

	public static void main(String[] args) {

int t=10,n1=0,n2=1,sum;
		
		for(int i=1;i<=t;i++) {
			System.out.print(n2+" ");
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}
}
