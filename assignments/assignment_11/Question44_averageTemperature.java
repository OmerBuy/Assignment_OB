package assignments.assignment_11;

public class Question44_averageTemperature {

	public static void main(String[] args) {

	        double arr[] = {80,88,88,84,82,78,60,68}; 
	        int n = arr.length; 
	      
	        System.out.println(average(arr, n)); 
	}
	public static double average(double a[], int x) { 
          
        double sum = 0; 
          
        for (int i = 0; i < x; i++) 
            sum += a[i]; 
      
        return sum / x; 
    } 
}
