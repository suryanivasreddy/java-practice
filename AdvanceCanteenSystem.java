package Day9practice;

import java.util.Scanner;

public class AdvanceCanteenSystem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int option;
		int teaPrice=10;
		int coffeePrice=15;
		int samosaPrice=20;
		int teaQuantity=0;
		int coffeeQuantity=0;
		int samosaQuantity=0;
		float total=0;
		int subtotal=0;
		int quantity=0;
		float tax;
		do { 
			System.out.print("\n\n\n=========================================\n"
					+ "||=========== CANTEEN MENU ===========||\n"
					+ "\t1. View Menu\n"
					+ "\t2. Order Items\n"
					+ "\t3. View Bill\n"
					+ "\t4. Checkout and Exit\n"
					+ "Enter your choice: ");
						option=s.nextInt();
			
			switch(option) {
			case 1:System.out.println( "\n\n---MENU---\n"
					+ "1.Tea\t\t- ₹10\n"
					+ "2.Coffee\t- ₹15\n"
					+ "3.Samosa\t- ₹20\n");
			break;
			case 2:System.out.print("Enter item number to order (1-3):");
					option=s.nextInt();
					System.out.print("Enter quantity:");
					quantity=s.nextInt();
					if(quantity<1) {
						System.out.println("invalid quantity entry.");
					}
					if(option==1&&quantity>0) {
						System.out.println(quantity+" Tea(s) added.");
						teaQuantity=quantity;
					}
					else {
						if(option==2&&quantity>0) {
							System.out.println(quantity+" Coffee(s) added.");
							coffeeQuantity=quantity;}
							else {if(option==3&&quantity>0) {
								System.out.println(quantity+" Samosa(s) added.");
								samosaQuantity=quantity;
							}else{
								System.out.println("invalid option");
							}}
						}
					
					break;
			case 3: System.out.println("---BILL---");
			if(teaQuantity>0) {
				System.out.println("Tea x"+teaQuantity+"= ₹"+teaPrice*teaQuantity);
				subtotal+=teaPrice*teaQuantity;
			}
			if(coffeeQuantity>0) {
				System.out.println("Coffee x"+coffeeQuantity+"= ₹"+coffeePrice*coffeeQuantity);
				subtotal+=coffeePrice*coffeeQuantity;
			}
			if(samosaQuantity>0) {
				System.out.println("Samosa x"+samosaQuantity+"= ₹"+samosaPrice*samosaQuantity);
				subtotal+=samosaPrice*samosaQuantity;
			}
			System.out.println("Subtotal = ₹"+subtotal);
			tax=(float)subtotal*5/100;
			System.out.println("Tax (5%) = ₹"+tax);
			total=tax+subtotal;
			System.out.println("Total = ₹"+total);
			
			
			break;
			case 4:System.out.println("Thank you ! Exiting system.");
			break;
			default:System.out.println("Invalid code");
		}
			
}while(option!=4);
		s.close();
		}

}
/*
 * Java Programming Question: Advanced Canteen System Question: Problem
 * Statement: You are tasked with developing an Canteen System for a small
 * canteen that handles ordering and billing. The system should present a menu
 * with options for ordering tea, coffee, and samosas. The user can place
 * orders, view their bill, and check out. The program should: Display the
 * canteen menu showing the price of each item (tea, coffee, samosas).
 * 
 * 
 * Allow the user to order items by selecting the item number (1 for Tea, 2 for
 * Coffee, 3 for Samosa) and entering the quantity.
 * 
 * View the bill that shows: The total cost of each item ordered. The subtotal
 * (sum of the cost of all ordered items). A 5% tax on the subtotal. The grand
 * total, which includes the subtotal and tax. Allow the user to checkout and
 * exit the system. The program should continuously display the menu of options
 * until the user chooses to exit. The switch-case statement should be used to
 * implement the logic for handling different user choices.
 * 
 * Requirements: Use the switch-case statement for handling different options
 * such as: Viewing the menu. Ordering items. Viewing the bill. Exiting the
 * system.
 * 
 * Each item in the menu (Tea, Coffee, Samosa) should have a fixed price: Tea:
 * ₹10 Coffee: ₹15 Samosa: ₹20 The tax rate should be set to 5% of the subtotal.
 * 
 * 
 * Item quantity validation: If the user enters an invalid quantity (less than
 * or equal to 0), display an error message. If the user selects an invalid item
 * number, display an error message. If the user selects an option not available
 * in the menu (i.e., any number other than 1, 2, 3, or 4), show an error
 * message.
 * 
 * Once the user selects "Checkout and Exit", print a thank you message and exit
 * the system.
 * 
 * 
 * Testcase -1 Order 2 Samosas and View Bill
 * ========================================= ||=========== CANTEEN MENU
 * ===========|| 1. View Menu 2. Order Items 3. View Bill 4. Checkout and Exit
 * Enter your choice: 1
 * 
 * 
 * --- MENU --- 1. Tea - ₹10 2. Coffee - ₹15 3. Samosa - ₹20
 * 
 * 
 * ||=========== CANTEEN MENU ===========|| 1. View Menu 2. Order Items 3. View
 * Bill 4. Checkout and Exit Enter your choice: 2 Enter item number to order
 * (1-3): 3 Enter quantity: 2 2 Samosa(s) added.
 * 
 * 
 * ||=========== CANTEEN MENU ===========|| 1. View Menu 2. Order Items 3. View
 * Bill 4. Checkout and Exit Enter your choice: 3
 * 
 * 
 * --- BILL --- Samosa x2 = ₹40 Subtotal = ₹40 Tax (5%) = ₹2.0 Total = ₹42.0
 * 
 * 
 * Test Case 2: Order 3 Teas and View Bill
 * —----------------------------------------------- ||=========== CANTEEN MENU
 * ===========|| 1. View Menu 2. Order Items 3. View Bill 4. Checkout and Exit
 * Enter your choice: 2 Enter item number to order (1-3): 1 Enter quantity: 3 3
 * Tea(s) added.
 * 
 * 
 * ||=========== CANTEEN MENU ===========|| 1. View Menu 2. Order Items 3. View
 * Bill 4. Checkout and Exit Enter your choice: 3
 * 
 * 
 * --- BILL --- Tea x3 = ₹30 Subtotal = ₹30 Tax (5%) = ₹1.5 Total = ₹31.5
 * 
 * 
 * Test Case 3: Order 2 Coffees + 1 Tea and View Bill
 * —---------------------------------------------------------------
 * ||=========== CANTEEN MENU ===========|| 1. View Menu 2. Order Items 3. View
 * Bill 4. Checkout and Exit Enter your choice: 2 Enter item number to order
 * (1-3): 2 Enter quantity: 2 2 Coffee(s) added.
 * 
 * 
 * ||=========== CANTEEN MENU ===========|| 1. View Menu 2. Order Items 3. View
 * Bill 4. Checkout and Exit Enter your choice: 2 Enter item number to order
 * (1-3): 1 Enter quantity: 1 1 Tea(s) added.
 * 
 * 
 * ||=========== CANTEEN MENU ===========|| 1. View Menu 2. Order Items 3. View
 * Bill 4. Checkout and Exit Enter your choice: 3
 * 
 * 
 * --- BILL --- Tea x1 = ₹10 Coffee x2 = ₹30 Subtotal = ₹40 Tax (5%) = ₹2.0
 * Total = ₹42.0
 * 
 * 
 * Test Case 4: Invalid Quantity (0) and Exit
 * —----------------------------------------------------- ||=========== CANTEEN
 * MENU ===========|| 1. View Menu 2. Order Items 3. View Bill 4. Checkout and
 * Exit Enter your choice: 2 Enter item number to order (1-3): 1 Enter quantity:
 * 0 Quantity must be greater than 0.
 * 
 * 
 * ||=========== CANTEEN MENU ===========|| 1. View Menu 2. Order Items 3. View
 * Bill 4. Checkout and Exit Enter your choice: 4 Thank you! Exiting system
 */