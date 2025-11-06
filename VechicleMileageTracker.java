package Day19practice;
import java.util.Scanner;
public class VechicleMileageTracker {

	private String vehicleNO;
	private String brand;
	private double fuel;
	private double distance;
	
	public VechicleMileageTracker() {
		this("unknown" , "unknown" , 0 , 0 );
	}
	

	public VechicleMileageTracker(String vehicleNO,String brand,double fuel,double distance) {
			
		
		this.vehicleNO=vehicleNO;
		this.brand= brand;
		this.fuel=fuel;
		this.distance=distance;
	}
	
	public double calculationofMileage(){
		return this.distance/this.fuel;
	}
	
	public void DisplayMileage() {
		System.out.println("Vehicle Details:");
		System.out.println("Vehicle No: "+this.vehicleNO);
		System.out.println("Brand: "+this.brand);
		System.out.println("Fuel Consumed: "+this.fuel);
		System.out.println("Distance Travelled: "+this.distance);
		System.out.println("Mileage: "+calculationofMileage()+" km/l");
	}
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		String vehicleNO=scanner.next();
		String brand=scanner.next();
		double fuel=scanner.nextFloat();
		double distance=scanner.nextFloat();
		VechicleMileageTracker v1=new VechicleMileageTracker(vehicleNO,brand,fuel,distance);
		v1.DisplayMileage();
		scanner.close();
	}

}
