package assignments.assignment_10;

public class Question26_uniqueCharacters {
	public static void main(String[] args) {
		
		String x = "Orrangge";
		uniqueCharacters(x);
		
	}
	public static void uniqueCharacters(String word) {
      
		String dummy = "";
        
        for (int i = 0; i < word.length(); i++) {
        	
            char ch = word.charAt(i);
            
            if (dummy.indexOf(ch) == -1) {
            	dummy = dummy + ch;
            } else {
            	dummy.replace(String.valueOf(ch),""); 
            }
        }

        System.out.println(dummy + " ");

    }
}
