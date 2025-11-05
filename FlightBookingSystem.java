package Day18practice;

public class FlightBookingSystem {
	private String flightNumber;
	private String destination;
	private double fare;

	FlightBookingSystem(String flightNumber,String destination,double fare){
		
		
		if(flightNumber==null||flightNumber.isEmpty()) {
			throw new IllegalArgumentException("Flight Number can not be empty");
			
		}
		if(destination==null||destination.isEmpty()) {
			throw new IllegalArgumentException("Destinatin can not be empty");
		}
		if(fare<=0) {
			throw new IllegalArgumentException("Fare must be postive");
		}
		this.flightNumber=flightNumber;
		this.destination=destination;
		this.fare=fare;
		
	}

	public void displayFlight() {
		System.out.println("Flight: "+this.flightNumber+",  Destination: "+this.destination+", Fare: "+this.fare);

	}
}



/*

SkyHigh Airlines Flight Booking System
Question:
 SkyHigh Airlines is developing an online booking system to manage flight reservations.
 Each flight has a flight number, destination, and fare.
The system must validate that:
Flight number and destination are not empty


Fare is positive


If invalid, throw an exception.
 Create a method displayFlight() to show the flight details.
Testcases
testcase-1
input
AA123
New York
250.0
output
Flight: AA123, Destination: New York, Fare: 250.00

testcase-2
input
AA
London
300.0
output
Flight: AA, Destination: London, Fare: 300.00

testcase-3
input
BA456
Paris
0.0
output
Error: Fare must be positive

testcase-4
input
UA789
Tokyo
500.0
output
Flight: UA789, Destination: Tokyo, Fare: 500.00

testcase-5
input
DL101
Paris
200.0
output
Flight: DL101, Destination: Paris, Fare: 200.00

*/