package assignments.assignment_9;

public class Question13_routeInstructions {

	public static void main(String[] args) {


		navigation('A', 'A');

	}
	// iki tane char parametresi alan bir method oluþturuyoruz
	public static void navigation(char start, char finish) {
			String result = "";
		/* start noktamýz finishe eþit olana kadar aþaðýdaki switch case i yapmasý için
		 while döngüsü içine yazýyoruz switch case i her seferinde start pointi kendinden sonraki
		 noktaya eþitliyoruz*/
			while (start != finish){
				switch (start) {
				case 'A': {
					result = result + "Right>";
					start = 'B';
					break;
				}
				case 'B': {
					result = result + "Down>";
					start = 'C';
					break;
				}
				case 'C': {
					result = result + "Left>";
					start = 'D';
					break;
				}
				case 'D': {
					result = result + "Up>";
					start = 65;
					
					break;
				}
				}
			}
			System.out.print(result + finish + " found");

}
}
