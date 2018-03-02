package se.garaget.misc;

// Class that returns an exception if we try
// to add a vehicle to a full garage.

public class GarageFullException extends Exception {
	public GarageFullException() {
		super("Garage full.");
	}
}
