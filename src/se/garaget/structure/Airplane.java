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

}
