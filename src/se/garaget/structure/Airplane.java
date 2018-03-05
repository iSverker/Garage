package se.garaget.structure;

public class Airplane extends Vehicle {

	private int altitude;
	private int numberOfEngines;
	
	public Airplane(FuelType fuelType, int numberOfSeats, int vehicleLength, String registrationNumber, int altitude) {
		super(fuelType, numberOfSeats, vehicleLength, registrationNumber);
		this.altitude = altitude;
	}
	
	public int getAltitude() {
		return altitude;
	}
	
	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	// Unique method (polymorphism)
	// Flying an airplane is cool!
	public boolean isCoolVehicle() {		
		return true;
	}
	
	// Returns info about the aeroplane
	// including that it's a cool vehicle!
	public String listVehicle() {
		String vehicleInfo = registrationNumber + " (" + this.getClass().getSimpleName().toLowerCase() + "): " + numberOfSeats + " seats, " + vehicleLength / 100.0 + " m, is ";
		vehicleInfo += isCoolVehicle() ? "" : "not ";
		return vehicleInfo + "a cool vehicle.";
	}
	
}
