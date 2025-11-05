package Day18practice;

import java.util.Scanner;


public class HighSchoolRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name = sc.nextLine();
            int roll = sc.nextInt();
            int grade = sc.nextInt();

            HighSchool s = new HighSchool(name, roll, grade);
            s.displayStudentInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }  finally {
            sc.close();
        }
    }
}