package Day9practice;

import java.util.Scanner;

public class HotelRoomPrice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int roomType = s.nextInt();
		int season = s.nextInt();
		switch (roomType) {
		case 1:

			if (season == 1) {
				System.out.println("$100");
			} else {
				if (season == 2) {
					System.out.println("$80");
				} else {
					System.out.println("Invalid code");
				}
			}
			break;
		case 2:
			if (season == 1) {
				System.out.println("$200");
			} else {
				if (season == 2) {
					System.out.println("$150");
				} else {
					System.out.println("Invalid code");
				}
			}
			break;
		default:
			System.out.println("Invalid code");

		}
s.close();
	}
}

/*
 * ////it can also write using switch inside switch again switch (roomType) {
 * case 1: switch (season) { case 1: System.out.println("$100"); break; case 2:
 * System.out.println("$80"); break; default:
 * System.out.println("Invalid code"); } break; case 2: switch (season) { case
 * 1: System.out.println("$200"); break; case 2: System.out.println("$150");
 * break; default: System.out.println("Invalid code"); } break; default:
 * System.out.println("Invalid code"); }
 * 
 * 
 * 
 * 
 * 
 */
/*
 * Problem Statement: A hotel system prices rooms based on type and season: •
 * Room Types: o 1: Standard o 2: Deluxe • Seasons: o 1: Peak o 2: Off-Peak •
 * Prices: o Standard Room:  Peak → $100  Off-Peak → $80 o Deluxe Room:  Peak
 * → $200  Off-Peak → $150
 * 
 * Input Format: Two integers: room and season, separated by a space. Output
 * Format: One of: "$100", "$80", "$200", "$150", or "Invalid Input"
 * 
 * Example: • Input: 1 1 • Output: $100
 * 
 * Constraints: • 1 ≤ room ≤ 2 • 1 ≤ season ≤ 2 • Use a switch statement for
 * room type
 */