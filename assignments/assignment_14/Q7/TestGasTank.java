package assignments.assignment_14.Q7;

public class TestGasTank {

	public static void main(String[] args) {

		GasTank gas = new GasTank(2000000);
		gas.addGas(100);
		System.out.println("getAmounth = "+gas.getGasLevel());
		gas.useGas(50000);
		System.out.println("getGasLevel  = " + gas.getGasLevel());
		gas.useGas(2L);
		gas.useGas(1);
		System.out.println("getGasLevel = " + gas.getGasLevel());
		
		gas.useGas(100);
		System.out.println("isEmpty = " + gas.isEmpty());
		gas.addGas(20.34);
		System.out.println("fillUp = " + gas.fillUp());
		System.out.println(gas.isFull());
		boolean isEmpty = gas.isEmpty();
		boolean isFull = gas.isFull();
	}

}
