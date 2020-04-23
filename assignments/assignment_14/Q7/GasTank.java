package assignments.assignment_14.Q7;

public class GasTank {

	double amounth = 0;
	double capacity;

	public GasTank(double capacity) {

		this.capacity = capacity;
	}

	public void addGas(double amounth) {
		amounth++;
		if (this.amounth > this.capacity) {
			this.amounth = this.capacity;
		}
	}

	public void useGas(double usedAmounth) {

		this.amounth = amounth - usedAmounth;
		if (this.amounth < 0) {
			this.amounth = 0;
		}
	}

	public boolean isEmpty() {
		if (this.amounth < 0.1) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isFull() {
		if (this.amounth > capacity-0.1) {
			return true;
		} else {
			return false;
		}
	}
	public double getGasLevel() {
		return this.amounth;
	}
	public double fillUp() {
		return this.capacity-this.getGasLevel();
	}
}
