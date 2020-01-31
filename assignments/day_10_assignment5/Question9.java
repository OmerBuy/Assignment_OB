package assignments.day_10_assignment5;

public class Question9 {

	public static void main(String[] args) {

		int num= 12345;
		int first  =  num % 10;
		int second =  ( num - first ) % 100 / 10;
		int third  =  ( num - first - second ) % 1000 / 100;
		int fourth =  ( num - first - second - third ) % 10000 / 1000;
		int fifth  =  ( num - first - second - third - fourth) % 100000 / 10000;
		System.out.println(fifth);
		System.out.println(fourth);
		System.out.println(third);
		System.out.println(second);
		System.out.println(first);
	}

}
