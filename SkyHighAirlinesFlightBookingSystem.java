package Day18practice;

import java.util.Scanner;

public class SkyHighAirlinesFlightBookingSystem {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			String flightNumber = scanner.nextLine();
			String destination= scanner.nextLine();
			double fare= Double.parseDouble(scanner.nextLine().trim());
			
			FlightBookingSystem user1 = new FlightBookingSystem(flightNumber, destination, fare);
			user1.displayFlight();
			
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}
}
