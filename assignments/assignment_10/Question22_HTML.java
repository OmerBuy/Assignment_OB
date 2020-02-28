package assignments.assignment_10;

import java.util.Scanner;

public class Question22_HTML {

	public static void main(String[] args) {

		
	
		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

		int fromHere = html.indexOf("id=\"") + "id=\"".length();
		int toHere = html.indexOf("\">", fromHere);

		if (fromHere != -1 && toHere != -1) {
			System.out.println(html.subSequence(fromHere, toHere));
		} else {
			System.out.println("Invalid input!");
		}
	}

}
