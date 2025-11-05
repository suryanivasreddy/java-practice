package Day18practice;

public class ParkingServicesSystem {
	private String type;
	private String licensePlate;
	private int hour;

	ParkingServicesSystem(String type,String licensePlate,int hour){
		
		
		if(type==null||type.isEmpty()) {
			throw new IllegalArgumentException("Vehicle type can not be empty");
			
		}
		if(licensePlate==null||licensePlate.isEmpty()) {
			throw new IllegalArgumentException("License Plate can not be empty");
		}
		if(hour<=0) {
			throw new IllegalArgumentException("Hours Parked must be non-negative");
		}
		this.type=type;
		this.licensePlate=licensePlate;
		this.hour=hour;
		
	}

	public void displayVehicle() {
		System.out.println("Type: "+this.type+",  License: "+this.licensePlate+", hour: "+this.hour);

	}
}
