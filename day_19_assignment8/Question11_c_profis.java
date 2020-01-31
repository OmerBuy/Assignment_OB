package assignments.day_19_assignment8;

public class Question11_c_profis {

	public static void main(String[] args) {
		System.out.println(c_profis(2000,1500));
	}

	private static String c_profis(int buyPrice, int sellPrice) {
		
		if(buyPrice>sellPrice) {
			return "loss";
		}else if(buyPrice<sellPrice) {
			return "profit";
		}else {
			return "no loss";
		}
	}
}
