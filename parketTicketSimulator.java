package pr2;

import java.util.Random;

public class parkingTicketSimulater {

	public static void main(String[] args) {

		ParkedCar parkedCar1 = new ParkedCar("toyota", "camry", "red", 875653, random());
		ParkedCar parkedCar2 = new ParkedCar("volkswagon", "jetta", "blue", 45653, random());
		ParkedCar parkedCar3 = new ParkedCar("nissan", "altima", "black", 3456343, random());

		ParkingMeter parkingMeter1 = new ParkingMeter(random(), 384945);
		ParkingMeter parkingMeter2 = new ParkingMeter(random(), 28464);
		ParkingMeter parkingMeter3 = new ParkingMeter(random(), 4392502);

		PoliceOfficer dave = new PoliceOfficer("dave", 546);

		ParkingTicket parking = new ParkingTicket(parkingMeter1, parkedCar1, dave);
		ParkingTicket parking1 = new ParkingTicket(parkingMeter2, parkedCar2, dave);
		ParkingTicket parking2 = new ParkingTicket(parkingMeter3, parkedCar3, dave);

		String parkingTicket = dave.examine(parkedCar1, parkingMeter1);
		String parkingTicket1 = dave.examine(parkedCar2, parkingMeter2);
		String parkingTicket2 = dave.examine(parkedCar3, parkingMeter3);


		if(parkingTicket == null && parkingTicket1 == null && parkingTicket2 == null) {
			System.out.println("No parking ticket generated!");
		} else {
			if(parkingTicket != null) {
				System.out.println(parking);
			} if(parkingTicket1 != null) {
				System.out.println(parking1);
			} if(parkingTicket2 != null) {
				System.out.println(parking2);
			}
		}


	}

	public static int random() {
		Random random = new Random();

		return random.nextInt(500) + 1;
	}

}
