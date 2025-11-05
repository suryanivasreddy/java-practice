package Day18practice;

import java.util.Scanner;

public class BrightFutureAcademy {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			int id=Integer.parseInt(scanner.nextLine().trim());
			String name = scanner.nextLine();
			String status = scanner.nextLine();
			
			AttendanceSystem s1=new AttendanceSystem(id,name,status);
			s1.displayAttendance();
		}
			catch(IllegalArgumentException e){
				System.out.println("Error: " + e.getMessage());
			}
			finally {
			scanner.close();
			}
	}

}
