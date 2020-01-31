package assignments.day_13_assignment6;

public class Question4 {

	public static void main(String[] args) {
		
//		Write a program to calculate the sum of the numbers from 1 till upper bound.
//		If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
//		If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
//		If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
//
//		You should use a while loop.
		int upper=5;
		int sum=0;
		for(int i=1;i<=upper;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
