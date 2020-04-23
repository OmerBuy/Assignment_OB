package assignments.assignment_14.Q5;

public class TV {
	int channel=1;
	int volumeLevel=1;
	boolean on = false;
	String brand = "undefined";
	
	public TV() {
	 System.out.println("Creating TV object using no Args- constructor");
	}
	public TV(String brand) {
		this.brand=brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if (channel <= 0 || channel > 120 || this.isOn() == false) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else
			this.channel = channel;
	}
	public int getVolumeLevel() {
		if (this.on == false) {
			System.out.println("Tv is OFF  ");
			return 0;
		} else
			return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if (volumeLevel < 1 || volumeLevel > 7 || this.isOn() == false) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");

		} else
			this.volumeLevel = volumeLevel;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	
	public void volumeDown() {
		if (this.getVolumeLevel() == 1 || this.on == false) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		} else
			this.volumeLevel--;
	}
	public void volumeUP() {
		if (this.getVolumeLevel() == 7 || this.isOn() == false) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		} else
			this.volumeLevel++;
	}
	
	public void isOn(boolean On){
		
	}
	public void turnOn(boolean On){
		if (this.on == true) {
			System.out.println("TV is already ON");
		} else {
			this.on = true;
		}
	}
	public void  turnOff(boolean On){
		if (this.on == false) {
			System.out.println("TV is already OFF");
		} else {
			this.on = false;
		}
	}
	
}
