package pr2;

public class ParkingTicket {
	private ParkingMeter parkingMeter;
	private ParkedCar parkedCar;
	private PoliceOfficer policeofficer;
	
	
	public ParkingTicket(ParkingMeter parkingMeter, ParkedCar parkedCar, PoliceOfficer policeOfficer) {
		this.parkingMeter = new ParkingMeter(parkingMeter);
		this.parkedCar = new ParkedCar(parkedCar);
		this.policeofficer = new PoliceOfficer(policeOfficer);
		
	}

	
	
	public String toString() {
		String str =  "****************************************** \n" + 
				"Parking meter: " + parkingMeter + "\nparked car: " + parkedCar + "\npolice officer:" + policeofficer;
		return str;
	}
	//toString
	
}
