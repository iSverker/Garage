package se.garaget.structure;

public class Motorcycle extends Vehicle {

	// Define unique property
	private int numberOfWheels;
	
	// Property for polymorphism
	private boolean harleyDavidson;
	
	// Constructor
	public Motorcycle(FuelType fuelType, int numberOfSeats, int vehicleLength, String registrationNumber,
			int numberOfWheels) {
		super(fuelType, numberOfSeats, vehicleLength, registrationNumber);
		this.numberOfWheels = numberOfWheels;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	// If the Motorcycle is a Harley Davidson, then it's a cool bike.
	public boolean isCoolVehicle() {
		return harleyDavidson;
	}
	
	public void setHarleyDavidson() {
		this.harleyDavidson = true;
	}
	
	// Returns info about the Motorcycile,
	// including if it's a Harley Davidson.
	public String listVehicle() {
		String vehicleInfo = registrationNumber + " (" + this.getClass().getSimpleName().toLowerCase() + "): " + numberOfSeats + " seats, " + vehicleLength / 100.0 + " m, is ";
		vehicleInfo += harleyDavidson ? "" : "not ";
		return vehicleInfo + "a Harley Davidson.";
	}
	
}
