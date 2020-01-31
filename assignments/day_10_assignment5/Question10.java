package assignments.day_10_assignment5;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter status code: "); 
		int code = sc.nextInt();

		switch(code) {
		case 200:
			System.out.println("OK");
			break;
		case 202:
			System.out.println("Created");
			break;
		case 301:
			System.out.println("Moved Permanently");
			break;
		case 303:
			System.out.println("See other");	
			break;
		case 304:
			System.out.println("Not modified");
			break;
		case 307:
			System.out.println("Temporary Redirect");
			break;
		case 400:
			System.out.println("Bad Request");
			break;
		case 401:
			System.out.println("Unauthorized");
			break;
		case 403:
			System.out.println("Forbidden");
			break;
		case 404:
			System.out.println("Not found");
			break;
		case 410:
			System.out.println("Gone");
			break;
		case 500:
			System.out.println("Internal Server Error");
			break;
		case 503:
			System.out.println("Service Unavailable");
			break;
		default :
			System.out.println("Invalid status code!");
			break;
		}
			
	}

}
