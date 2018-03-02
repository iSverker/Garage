package se.garaget.structure;

public class Car extends Vehicle {

	private boolean autonomous;
	
	public Car(FuelType fuelType, int numberOfSeats, int vehicleLength, String registrationNumber, int numberOfWheels, boolean autonomous) {
		super(fuelType, numberOfSeats, vehicleLength, registrationNumber);
		this.autonomous = autonomous;
	}
	
	public boolean isAutonomous() {
		return autonomous;
	}
	
	// Polymorphic method
	// Electric cars are cool
	public boolean isCoolVehicle() {
		return this.fuelType == FuelType.electric; 
	}
	
}
