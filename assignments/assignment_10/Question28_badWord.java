package assignments.assignment_10;

public class Question28_badWord {

	public static void main(String[] args) {
		clean ("one two three","two");
	    // returns "one three"

	     clean ("foo bar","foo");
	    // returns "bar"

	     clean ("he said bla bla bla bla bla bla","bla");
	  //   returns "he said "
		
		
	}

	 public static String clean(String string, String word) {
	        
	        if (string.contains(word)) { 
	         
	            String tempWord = word + " "; 
	            string = string.replaceAll(tempWord, ""); 
	 
	            tempWord = " " + word; 
	            string = string.replaceAll(tempWord, ""); 
	        } System.out.println(string);
	  
	        return string; 
	    } 
	  
}