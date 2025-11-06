package Day19practice;
import java.util.*;
public class Employee {
	int id;
	String name;
	double salary;
	int experience;
	
	
	
	public Employee() {
		this(0,"unknow",0.0,0);
	}
	public Employee(int id,String name, double salary,int experience) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.experience=experience;
		
	}
	public double calculateBonus() {
		if(this.experience<3)
			return this.salary*0.05;
		else if(this.experience<=7) {
			return this.salary*0.10;
		}else {
				return this.salary*0.15;
			}
		}
	
	public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Experience: " + this.experience);
        System.out.println("Bonus: " + this.calculateBonus());
    }
	
	
	
		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int id = sc.nextInt();
		        String name = sc.next();
		        double salary = sc.nextDouble();
		        int exp = sc.nextInt();

		        Employee emp = new Employee(id, name, salary, exp);
		        emp.displayDetails();

		        sc.close();
		    }
	}


