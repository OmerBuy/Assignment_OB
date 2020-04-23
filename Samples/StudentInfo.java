package Samples;

public class StudentInfo {

public static void main(String[] args) {
		
		Info arrs[] = new Info[2];
		arrs[0]= new Info("A", 5); // looks weird but it works :)
		arrs[1]= new Info("B", 7);
		
		for(int i=0; i<arrs.length;i++) {
			System.out.println("Name = "+ arrs[i].name + " , Age = "+ arrs[i].age);
		}		
	}
}
