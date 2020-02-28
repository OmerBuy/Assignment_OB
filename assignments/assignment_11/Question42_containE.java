package assignments.assignment_11;

public class Question42_containE {

	public static void main(String[] args) {
		
		String[] arr = { "zero", "one", "two", "three", "four" };
		int counter = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i].contains("e")) {
				counter++;
			}
		}
		System.out.println(counter);
		String[] fewValues = new String[counter];
		int i = 0;
		for (int j =0; j<arr.length;j++) {
			if (arr[j].contains("e")) {
				fewValues[i] = arr[j];
				i++;
			}
		}
		for(String val:fewValues) {
		System.out.print(val+" ");}
	}
}
		
		
