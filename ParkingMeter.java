package pr2;

public class ParkingMeter {
	private int parkingLotNumber;
	private int minutesOnMeter;

	public ParkingMeter(int minutesOnMeter, int parkingLotNumber) {
		this.minutesOnMeter = minutesOnMeter;
		this.parkingLotNumber = parkingLotNumber;
	}

	public ParkingMeter(ParkingMeter parkingMeter) {
		minutesOnMeter = parkingMeter.minutesOnMeter;
		parkingLotNumber = parkingMeter.parkingLotNumber;
	}

	private void setParkingLotNumber(int ParkingLotNumber) {
		this.parkingLotNumber = parkingLotNumber;
	}

	public int getParkingLotNumber() {
		return this.parkingLotNumber;
	}

	public void setMinutesOnMeter(int minutesOnMeter) {
		minutesOnMeter = minutesOnMeter;
	}

	public int getMinutesOnMeter() {
		return minutesOnMeter;
	}

	public String toString() {
		String str = "minutes on meter: " + minutesOnMeter + "\n parking lot number: " + parkingLotNumber + '\n';
		return str;
	}

}
