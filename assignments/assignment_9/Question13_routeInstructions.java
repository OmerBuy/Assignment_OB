package assignments.assignment_9;

public class Question13_routeInstructions {

	public static void main(String[] args) {


		navigation('A', 'A');

	}
	// iki tane char parametresi alan bir method olu�turuyoruz
	public static void navigation(char start, char finish) {
			String result = "";
		/* start noktam�z finishe e�it olana kadar a�a��daki switch case i yapmas� i�in
		 while d�ng�s� i�ine yaz�yoruz switch case i her seferinde start pointi kendinden sonraki
		 noktaya e�itliyoruz*/
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
