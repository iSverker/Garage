package se.garaget.misc;

public class CannotCreateVehicleException extends Exception {
	private static final long serialVersionUID = 1L;

	public CannotCreateVehicleException() {
		super("Cannot create vehicle");
	}
}