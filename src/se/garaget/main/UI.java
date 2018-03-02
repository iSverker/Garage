package se.garaget.main;
import java.util.Scanner;
import se.garaget.structure.*;

public class UI {

	public static void welcome() {
		
		System.out.println("Welcome to Garage 1.0!");
		System.out.println("----------------------");	
		garage();
		
	}
	public static void garage() {
	
		System.out.println("1. Customer");
		System.out.println("2. Administrator");
		System.out.println("Please select: ");
	
		Scanner scanner = new Scanner(System.in);
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("\nSelection not possible");
            garage();
		}
		int choice = scanner.nextInt();
	
		if (choice == 1) {
			customer();
		} else if (choice == 2) {
			administrator();
		} else {
            System.out.println("Selection not possible.");
            garage();
        }
		scanner.close();
	}
	
	public static void customer() {
		
		System.out.println("1. Park - new customer");
		System.out.println("2. Park - returning customer");
		System.out.println("3. Collect");
		System.out.println("Please select: ");
		
		Scanner scanner = new Scanner(System.in);
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("\nSelection not possible");
            customer();
		}
		int choice = scanner.nextInt();
	
		if (choice == 1) {
			System.out.println("Please enter your registration number: ");
//			parkArray();
		} else if (choice == 2) {
			System.out.println("Please enter your registration number: ");
		} else if (choice == 3) {
			System.out.println("Please enter your registration number: ");	
//			collectArray();
		} else {
            System.out.println("Selection not possible.");
            customer();
        }
		scanner.close();
	}
	
	public static void administrator() {
		
		Garage garage = new Garage();
		System.out.println("1. List all parked vehicles");
		System.out.println("2. List all vehicle types");
		System.out.println("3. Search");
		
		Scanner scanner = new Scanner(System.in);
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("\nSelection not possible");
            administrator();
		}
		int choice = scanner.nextInt();
	
		if (choice == 1) {
			System.out.println("Number of vehicles: " + garage.numberOfVehicles());	
		} else if (choice == 2) {
			System.out.println("Vehicles per type: ");
		} else if (choice == 3) {
			System.out.println("Search: ");
		} else {
            System.out.println("Selection not possible.");
         administrator();
        }
		scanner.close();
	
	}

	
	
}