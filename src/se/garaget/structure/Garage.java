package se.garaget.structure;

import java.util.ArrayList;
import java.util.List;

import se.garaget.misc.GarageFullException;

public class Garage {

	// Set limit to 100 vehicles
	private int maxVehicles = 100;

	// When the garage is created,
	// it has no vehicles.
	private int numberOfVehicles = 0;

	// Create the inventory/"parking spots"
	private List<Vehicle> inventory = new ArrayList<Vehicle>();

	public void parkVehicle(Vehicle vehicle) throws GarageFullException {

		// If the garage is not full,
		// add the new vehicle at position numberOfVehicles
		// and increase the value of numberOfVehicles
		if (inventory.size() < maxVehicles) {
			inventory.add(vehicle);
		} else
			throw new GarageFullException();

	}

	public int numberOfVehicles() {
		return numberOfVehicles;
	}

	// Lists all vehicles in the garage
	public void listAllVehicles() {
		for (Vehicle v : inventory) {
			System.out.println(v.listVehicle());
		}
	}

	// Lists all vehicle types in the garage
	public void listAllVehicleTypes() {
		int numberOfTypes = 0;
		String[] vehicleType = new String[100];

		// Loop through all vehicles
		// to find unlisted types.
		for (Vehicle v : inventory) {

			// Variable to track if the type
			// is added to the list yet.
			boolean found = false;

			if (numberOfTypes == 0) {
				vehicleType[numberOfTypes++] = v.getClass().getSimpleName();
			} else {
				for (int listPosition = 0; listPosition < numberOfTypes && !found; listPosition++) {
					// If the vehicle is in the list type,
					// then break out of the loop.
					System.out.println(v.getClass().getSimpleName());
				}
			}
		}

	}

}
