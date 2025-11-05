package Day18practice;

import java.util.Scanner;

public class FitLifeGym {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			String name = scanner.nextLine();
			int steps = Integer.parseInt(scanner.nextLine().trim());
			double calories= scanner.nextDouble();

			WorkoutTracker user1 = new WorkoutTracker(name, steps, calories);
			user1.displayUserDetails();
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}

}
