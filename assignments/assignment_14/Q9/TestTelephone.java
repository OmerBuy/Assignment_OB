package assignments.assignment_14.Q9;

public class TestTelephone {

	public static void main(String[] args) {

		Telephone tel = new Telephone();
		tel.setNumber("658745");
		System.out.println(tel.getNumber());
		
		System.out.println(tel.total);
		System.out.println(tel.quantitiy);
		
		System.out.println(Telephone.total);
	}

}
