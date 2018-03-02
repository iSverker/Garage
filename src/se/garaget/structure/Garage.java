package se.garaget.structure;
import se.garaget.misc.*;

public class Garage {
	
	// Set limit to 100 vehicles
	private int maxVehicles = 100;
	
	// When the garage is created,
	// it has no vehicles.
	private int numberOfVehicles = 0;
	
	// Create the inventory/"parking spots"
	private Vehicle[] inventory = new Vehicle[maxVehicles];
			
	public void addVehicle(Vehicle vehicle) throws GarageFullException {
		
		// If the garage is not full, 
		// add the new vehicle at position numberOfVehicles
		// and increase the value of numberOfVehicles
		if (numberOfVehicles < maxVehicles) {
			inventory[numberOfVehicles++] = vehicle;
		} else throw new GarageFullException();
		
		//TODO: Remove this message
		System.out.println("A vehicle of type " + vehicle.getClass() + " was added to the garage.");
	}
	
	public int numberOfVehicles() {
		return numberOfVehicles;
	}
	
}
