package se.garaget.structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Garage {

	// Set limit to 100 vehicles
	private int maxVehicles = 100;

	// Create the inventory/"parking spots"
	private List<Vehicle> inventory = new ArrayList<Vehicle>();

	public void parkVehicle(Vehicle vehicle) {

		// If the garage is not full,
		// add the new vehicle at position numberOfVehicles
		// and increase the value of numberOfVehicles
		if (inventory.size() < maxVehicles) {
			inventory.add(vehicle);
		} else
			System.out.println("Garage already full.");

	}

	// Check out vehicle from garage
	// If the vehicle is in the garage,
	// remove it from the list.

	public void checkOutVehicle(String regNo) {

		// First, set variable that keeps track of
		// whether a vehicle has been checked out.
		boolean vehicleCheckedOut = false;

		// Loop through the inventory. If same registration numer
		// is found, set vehicleCheckedOut to true, remove the vehicle
		// from the list and break out of the loop.
		for (Vehicle v : inventory) {
			if (v.getRegistrationNumber() == regNo) {
				vehicleCheckedOut = true;
				inventory.remove(v);
				break;
			}
		}

		// Tell the user if the check out was successful.
		if (vehicleCheckedOut) {
			System.out.println("Vehicle " + regNo + " checked out.");
		} else {
			System.out.println("The was no " + regNo + " in the garage.");
		}

	}

	public void findVehicleByRegNo(String regNo) {

		// First, set variable that keeps track of
		// whether a vehicle has been checked out.
		boolean vehicleFound = false;

		// Loop through the inventory. If same registration numer
		// is found, set vehicleCheckedOut to true, remove the vehicle
		// from the list and break out of the loop.
		for (Vehicle v : inventory) {
			if (v.getRegistrationNumber().equalsIgnoreCase(regNo)) {
				System.out.println("Found: " + v.getVehicleData());
				vehicleFound = true;
			}
		}

		// If we didn't find any vehicles, say that.
		// (Otherwise we've already listed at least 1 vehicle.)
		if (!vehicleFound) {
			System.out.println("No vehicle found.");
		}

	}

	public int numberOfVehicles() {
		return inventory.size();
	}

	// Lists all vehicles in the garage
	public void listAllVehicles() {
		for (Vehicle v : inventory) {
			System.out.println(v.listVehicle());
		}
	}

	// Lists all vehicle types in the garage
	public void listAllVehicleTypes() {

		// Loop through all vehicles to find unlisted types.
		Set<String> allVehicleTypes = new HashSet<>();

		for (Vehicle v : inventory) {
			// Adds a vehicle to Set if it doesn't already exist.
			allVehicleTypes.add(v.getClass().getSimpleName());
		}

		System.out.println("Current vehicles in garage: " + allVehicleTypes);

	}

}
