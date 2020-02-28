package assignments.assignment_11;

public class Question46_shortestWordsAgain {

	public static void main(String[] args) {

		String words[] = { "olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray" };
        
		System.out.println(smallest(words));
    
	}

	public static int smallest(String s[]) {
        int l = Integer.MAX_VALUE;
        String[] words=s[].split(" ");
        for (int i=0;i<s.length;i++) {
        	
          l = Math.min(l, words[i].length());
        }
        return l;
    }
}