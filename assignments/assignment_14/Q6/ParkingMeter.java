package assignments.assignment_14.Q6;

public class ParkingMeter {

	int timeLeft = 0;
	int maxTime;

	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}

	public boolean add(int i) {
		if (i == 25 && this.getMaxTime() >= i + this.timeLeft) {
			this.timeLeft = 30 + this.timeLeft;
			return true;
		} else
			return false;
	}

	public int getTimeLeft() {
		return timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}

	public void tick() {
		if (this.getTimeLeft() > 0)
			this.setTimeLeft(this.getTimeLeft() - 1);
	}

	public boolean isExpired() {
		if (this.getTimeLeft() == 0) {
			return true;
		} else {
			return false;
		}

	}
}
