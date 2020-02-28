package assignments.assignment_10;

public class Question30_ {

	public static void main(String[] args) {

		/**
		 * Insert the 'insert' String at the index 'position' into the 'target' String.
		 * at3("AC", 1, "xxx") -> "AxxxC"
		 * at3("AB", 2, "C") -> "ABC*/
	
			System.out.println(at3("longword","foo"));
     	//	return: "lonfoogword"

     		System.out.println(at3("blabla","a"));
     	//	return: "blaabla"
		
	}

		public static String at3(final String target, final String insert) {
		    final int targetLen = target.length();
	
		    if (insert.isEmpty()) {
		        return target;
		    }
		   
		    final int insertLen = insert.length();
		    final char[] buffer = new char[targetLen + insertLen];
		    target.getChars(0, 3, buffer, 0);
		    insert.getChars(0, insertLen, buffer, 3);
		    target.getChars(3, targetLen, buffer, 3 + insertLen);
		    return new String(buffer);
		}
}