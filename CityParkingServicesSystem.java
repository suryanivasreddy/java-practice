package Day18practice;

import java.util.Scanner;

public class CityParkingServicesSystem {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			try {

				String type = scanner.nextLine();
				String licensePlate= scanner.nextLine();
				int hour= Integer.parseInt(scanner.nextLine().trim());
				
				ParkingServicesSystem user1 = new ParkingServicesSystem(type, licensePlate, hour);
				user1.displayVehicle();
				
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				scanner.close();
			}

		}

}



/*

City Parking Services System
Question:
 City Parking Services is developing a system to manage parking slots.
 Each vehicle has a type, license plate, and hours parked.
Validations:
Type and license plate cannot be empty


Hours parked must be non-negative


If invalid, throw an exception.
 Create a method displayVehicle() to show vehicle details.
Testcases
testcase-1
input
Car
ABC123
4
output
Type: Car, License: ABC123, Hours Parked: 4

testcase-2
input
Scooty
XYZ789
3
output
Type: Scooty, License: XYZ789, Hours Parked: 3

testcase-3
input
Truck
LMN456
-1
output
Error: Hours parked must be non-negative

testcase-4
input
Van
PQR101
5
output
Type: Van, License: PQR101, Hours Parked: 5


*/