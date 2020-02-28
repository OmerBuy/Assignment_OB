package assignments.assignment_11;

import java.util.Arrays;

public class Question48_binary {

	public static void main(String[] args) {
		toBinary(3);
		toBinary(35);
		toBinary(255);
		
		
	}
	public static void toBinary(int decimal) {
		
		Integer num=new Integer(decimal);
		String str= Integer.toBinaryString(decimal);
		int leng=str.length();
		String addition="";
		if(leng<8) {
			for (int i=1;i<=8-leng; i++) {
				addition=addition.concat("0");
			}
			str=addition.concat(str);
		}
		String [] arr=str.split("");
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	}

