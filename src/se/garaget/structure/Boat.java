package se.garaget.structure;

import se.garaget.misc.CannotCreateVehicleException;

public class Boat extends Vehicle {

	private int load;
	
	public Boat(FuelType fuelType, int numberOfSeats, int vehicleLength, String registrationNumber, int load) throws CannotCreateVehicleException {
		super(fuelType, numberOfSeats, vehicleLength, registrationNumber);
		this.load = load;
	}
	
	public int getLoad() {
		return load;
	}

	// A boat longer than 10 m is cool
	public boolean isCoolVehicle() {
		return this.vehicleLength > 10000;
	}
	
}
