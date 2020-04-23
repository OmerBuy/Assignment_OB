package assignments.assignment_14.Q12;

public class Test {

	public static void main(String[] args) {
		
		int memorySize=5;
		int imageSize=40;
		
		Phone apple = new CameraPhone(memorySize,imageSize);
		
		int numPictures = ((CameraPhone) apple).numPictures();
		System.out.println(numPictures);

	}

}
