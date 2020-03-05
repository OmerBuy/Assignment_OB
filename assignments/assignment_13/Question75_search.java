package assignments.assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question75_search {

	public static void main(String[] args) {

		ArrayList<String>list = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
		
		System.out.println(search(list,"four"));

		
	}

	public static String search(ArrayList<String> list, String find) {

		String print="";
		String failed = "Search failed  (no \""+find+"\" in any element)";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).indexOf(find)>=0) {
				print=list.get(i);
				return print;
			}
		}
		return failed;
	}
}