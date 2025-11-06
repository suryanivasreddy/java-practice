package Day19practice;
import java.util.*;
public class SafeBank {

	
		int loanId;
		String name;
		double loanAmount;
		String loanType;
		
		
		
		public SafeBank() {
			this(0,"unknow",0.0,"unknow");
		}
		public SafeBank(int loanId,String name, double loanAmount,String loanType) {
			this.loanId=loanId;
			this.name=name;
			this.loanAmount=loanAmount;
			this.loanType=loanType;
			
		}
		public double calculateTotalPayable() {
			if(this.loanType.equalsIgnoreCase("car"))
				return this.loanAmount*0.09+this.loanAmount;
			else if(this.loanType.equalsIgnoreCase("personal")) {
				return this.loanAmount*0.11+this.loanAmount;
			}else if(this.loanType.equalsIgnoreCase("home")) {
				return this.loanAmount*0.08+this.loanAmount;
				
			}else
				return 0;
			}
		
		public void displayDetails() {
	        System.out.println("Loan Details:");
	        System.out.println("Loan ID: " + this.loanId);
	        System.out.println("Customer Name: " + this.name);
	        System.out.println("Loan Amount: " + this.loanAmount);
	        System.out.println("Loan Type: " + this.loanType);
	        System.out.println("Total Payable: " + this.calculateTotalPayable());
	    }
		
		
		
			
			    public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);

			        int loanId = sc.nextInt();
			        String name = sc.next();
			        double loanAmount= sc.nextDouble();
			        String loanType = sc.next();

			        SafeBank n1= new SafeBank(loanId, name, loanAmount, loanType);
			        n1.displayDetails();

			        sc.close();
			    }
		}




