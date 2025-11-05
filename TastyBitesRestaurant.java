package Day18practice;
import java.util.Scanner;
public class TastyBitesRestaurant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			String item = scanner.nextLine();
			double price = Double.parseDouble(scanner.nextLine().trim());
			String category = scanner.nextLine();

			MenuItemManagement item1 = new MenuItemManagement(item, price, category);
			item1.displayItemDetails();
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}

}
