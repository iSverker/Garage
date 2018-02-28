package se.garaget.structure;

public class Motorcycle extends Vehicle {

	// Define unique property
	private int numberOfWheels;

	// Common 2-wheel motorcycle
	public Motorcycle() {
		this(2);
	}

	public Motorcycle(int numberOfWheels) {
		super();
		this.numberOfWheels = numberOfWheels;
	}
	
}
