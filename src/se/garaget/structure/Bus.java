package se.garaget.structure;

import se.garaget.misc.CannotCreateVehicleException;

public class Bus extends Vehicle {

	private int storeys;

	public Bus(FuelType fuelType, int numberOfSeats, int vehicleLength, String registrationNumber, int storeys)
			throws CannotCreateVehicleException {
		super(fuelType, numberOfSeats, vehicleLength, registrationNumber);
		// Add unique parameter storeys
		this.storeys = storeys;
		
	}
	
	public int getStoreys() {
		return storeys;
	}
	
	// Implementation of abstract method.
	// Buses with at least 2 storeys are cool.
	public boolean isCoolVehicle() {
		return storeys > 1;
	}
	
	// Returns info about the Motorcycile,
	// including if it's a Harley Davidson.
	public String listVehicle() {
		return registrationNumber + " (" + this.getClass().getSimpleName().toLowerCase() + "): " + numberOfSeats + " seats, " + vehicleLength / 100.0 + " m, has " + storeys + " storeys.";
	}

}
