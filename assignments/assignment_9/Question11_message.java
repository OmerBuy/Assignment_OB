package assignments.assignment_9;

public class Question11_message {

	public static void main(String[] args) {
//		We have a message variable already declared and assigned value in this format
//		Sender:<Mike Smith>. From Number:[202-123-3456]. 
//		Message:{I love programing and problem solving}
//
//		Variables are already declared:
//
//		sender, phoneNumber, message
//		- by using String methods:
//		retrieve related information from SMSmessage string 
//		and assign to those 3 variables.
//		-print each variable in separate line
//
//		Sender: Mike Smith
//		Phone Number: 202-123-3456
//		Message body: I love programing and problem solving

		String sender = "<Mike Smith>";
		String phoneNumber = "[202-123-3456]";
		String messageBody = "{I love programing and problem solving}";

		int indexOfBra = sender.indexOf("<") + 1;
		int indexOfKet = sender.indexOf(">");
		int indexOfSquareBrackets1 = phoneNumber.indexOf("[") + 1;
		int indexOfSquareBrackets2 = phoneNumber.indexOf("]");
		int indexOfCurlyBrackets1 = messageBody.indexOf("{") + 1;
		int indexOfCurlyBrackets2 = messageBody.indexOf("}");
		
		System.out.println("Sender: " + sender.substring(indexOfBra, indexOfKet));
		System.out.println("Phone Number: " + phoneNumber.substring(indexOfSquareBrackets1, indexOfSquareBrackets2));
		System.out.println("Message body: " + messageBody.substring(indexOfCurlyBrackets1, indexOfCurlyBrackets2));

	}

}