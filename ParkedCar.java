package pr2;

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private int licensePlate;
	private int minutesParked;
	
	public ParkedCar(String make, String model, String color, int licensePlate, int minutesParked) {
		
		this.make = make;
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
		this.minutesParked = minutesParked;
	}
	
	public ParkedCar(ParkedCar parkedCar) {
		make = parkedCar.make;
		model = parkedCar.model;
		color = parkedCar.color;
		licensePlate = parkedCar.licensePlate;
		minutesParked = parkedCar.minutesParked;
	}

	public void setMake(String make) {
		this.make = make;
		
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setLicensePlate(int licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getLicensePlate() {
		return this.licensePlate;
	}
	
	public int getMinutesParked() {
		return minutesParked;
	}
	
	public String toString() {
		String str = "\nmake: " + make + '\n' + 
					 "model: " + model + '\n' + 
					 "color: " + color + '\n' + 
					 "license plae: " + licensePlate + '\n'  +
					 "minutes parked: " + getMinutesParked() + '\n';
		return str;
	}
}
