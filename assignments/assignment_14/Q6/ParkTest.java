package assignments.assignment_14.Q6;

public class ParkTest {

	public static void main(String[] args) {

		ParkingMeter pm = new ParkingMeter(34);

		System.out.println(pm.getMaxTime());
		pm.add(24);
		System.out.println(pm.getTimeLeft());
		for (int i = 0; i < 28; i++) {
			pm.tick();
			System.out.println(pm.getTimeLeft());
			System.out.println("pm.isExpired() = " + pm.isExpired());
			pm.tick();
			System.out.println("pm.getTimeLeft() = " + pm.getTimeLeft());
//			pm.tick();
//			pm.tick();
//			pm.tick();
//			pm.tick();
//			pm.tick();
			System.out.println("pm.getTimeLeft() = " + pm.getTimeLeft());
			System.out.println("pm.isExpired() = " + pm.isExpired());
		}

	}
}