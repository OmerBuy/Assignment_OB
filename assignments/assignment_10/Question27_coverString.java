package assignments.assignment_10;

public class Question27_coverString {

	public static void main(String[] args) {
		coverString("java methods", "me");      //==> "java [me]thods"

	    coverString("Certified Wooden Spoon", "o"); // ==> "Certified W[o][o]den Sp[o][o]n"

	    coverString("hello hello", "ello");  //==> "h[ello] h[ello]"

	    coverString("apples", "pears");     //==> "[apples]"
		coverString("java methods", "me"); //) ; ==> "java [me]thods"
	}

	public static void coverString(String x, String y) {

		if (x.contains(y)) { 
            
            x = x.replaceAll(y, "["+y+"]"); 
  
            System.out.println(x);
        } 
	}
}
