package Day18practice;

import java.util.Scanner;

public class ShopEasyProductManagementSystem {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			String name = scanner.nextLine();
			double price= Double.parseDouble(scanner.nextLine().trim());
			int quantity = Integer.parseInt(scanner.nextLine().trim());
			
			ProductManagement user1 = new ProductManagement(name, price, quantity);
			user1.displayProduct();
			
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}
}
