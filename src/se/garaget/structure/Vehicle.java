package se.garaget.structure;

public abstract class Vehicle {

	// Define mandatory properties.
	// They are set in the instantiating subclasses.

	protected FuelType fuelType;
	protected int numberOfSeats;
	protected int vehicleLength;
	protected String registrationNumber;

	public Vehicle(FuelType fuelType, int numberOfSeats, int vehicleLength, String registrationNumber) {
		this.fuelType = fuelType;
		this.numberOfSeats = numberOfSeats;
		this.vehicleLength = vehicleLength;
		this.registrationNumber = registrationNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public int getLength() {
		return vehicleLength;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public String toString() {
		return getClass().getSimpleName();
	}
	
	public String getVehicleData() {
		String coolVehicle = isCoolVehicle() ? "It's a cool vehicle" : "It's a dull vehicle.";
		return getRegistrationNumber() + ": Runs on " + getFuelType() + ", " + getNumberOfSeats() + " seats, "
				+ getLength() + " cm. " + coolVehicle;
	}

	// Abstract method to determine if
	// the vehicle is cool or not.
	// Must be implemented in subclasses.

	public abstract boolean isCoolVehicle();
	public abstract String listVehicle();
	
}
