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
		} else throw new GarageFullException();
		
		//TODO: Remove this message
		System.out.println("A vehicle of type " + vehicle.getClass().getSimpleName() + " was added to the garage.");
		System.out.println("Now we have " + inventory.size() + " vehicles.\n");
	}
	
	public int numberOfVehicles() {
		return numberOfVehicles;
	}
	
}
