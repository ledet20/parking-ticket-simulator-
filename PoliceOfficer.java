package pr2;

public class PoliceOfficer {
	private String name;
	private int badgeNumber;
	
	public final int FEE_AMOUNT = 1;
	
	public PoliceOfficer(String name, int badgeNumber) {
		this.name = name;
		this.badgeNumber = badgeNumber; 
	}
	
	public PoliceOfficer(PoliceOfficer policeOfficer) {
		// TODO Auto-generated constructor stub
		name = policeOfficer.name;
		badgeNumber= policeOfficer.badgeNumber; 
	}

	public String examine(ParkedCar parkedCar, ParkingMeter parkingMeter) {
		
		
		String fine = null;
		int parkingTimeOver  = parkingMeter.getMinutesOnMeter() - parkedCar.getMinutesParked();
		
		int feeAmount = FEE_AMOUNT * parkingTimeOver;
		
		if(parkingTimeOver > 0) {
		
			 fine = "$"+ feeAmount;
			
		} 
		
		return fine;


		
	}
	
	public String toString() {
		String str = "\nName: " + name + "\n" + "badge number: " + badgeNumber +  '\n' ;
		return str;
	}
}
