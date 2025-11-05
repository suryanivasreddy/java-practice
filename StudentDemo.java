package Day18practice;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		int[] marks= {33,24,29};
		Student s2=new Student("nivas",553,marks);
		s1.displayDetails();
		System.out.println("total sum of marks = "+s1.calculateTotal());
		System.out.println("Average of marks = "+s1.calculateAverage());
		s2.displayDetails();
		System.out.println("total sum of marks = "+s2.calculateTotal());
		System.out.println("Average of marks = "+s2.calculateAverage());
		
		
	}

}
