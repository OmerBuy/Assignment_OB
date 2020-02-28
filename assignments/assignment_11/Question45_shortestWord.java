package assignments.assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Question45_shortestWord {

	public static void main(String[] args) {

		String [] arr = {"java","cable","red","vivid","remedy","grace"};
        smallest(arr);
        System.out.println(smallest(arr));
    }

    public static String smallest(String arr[]) {
        String first = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            if ((arr[i].length()<first.length())) {
                first = arr[i];
            } 
        } 
        return first;
    }
}