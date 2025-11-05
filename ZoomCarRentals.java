package Day18practice;
import java.util.*;
public class ZoomCarRentals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			String brand = scanner.nextLine();
			String model = scanner.nextLine();
			double price = scanner.nextDouble();

			ZoomCar c1 = new ZoomCar(brand, model, price);
			c1.displayCarInfo();
		}catch(IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
		scanner.close();
		}
	}

}
