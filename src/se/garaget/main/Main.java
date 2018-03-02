package se.garaget.main;

import se.garaget.misc.CannotCreateVehicleException;
import se.garaget.misc.GarageFullException;
import se.garaget.structure.*;

public class Main {

	public static void main(String[] args) {

		// Create a new garage
		Garage garage = new Garage();

		// Add some vehicles and throw
		// an exception if it doesn't work.

		try {
			Vehicle motorcycle1 = new Motorcycle(FuelType.petrol, 2, 200, "MY BIKE", 2);
			Vehicle boat1 = new Boat(FuelType.petrol, 5, 400, "Eulalia III", 500);
			garage.parkVehicle(motorcycle1);
			garage.parkVehicle(boat1);
		} catch (GarageFullException | CannotCreateVehicleException e) {
			e.printStackTrace();
		}

		// Dra igång användargränssnittet
		UI ui = new UI();
		UI.welcome();

	}

}
