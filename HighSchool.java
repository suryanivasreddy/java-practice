package Day18practice;


class HighSchool {
    private String name;
    private int rollNumber;
    private int grade;

    public HighSchool(String name, int rollNumber, int grade) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (rollNumber <= 0) {
            throw new IllegalArgumentException("Roll number must be positive");
        }
        if (grade < 1 || grade > 12) {
            throw new IllegalArgumentException("Grade level must be between 1 and 12");
        }
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade);
    }
}



/*
public class HighSchool {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		int rollno=scanner.nextInt();
		int grade=scanner.nextInt();
		if(name==null)
			System.out.println("Error: Name is empty please fill name");
		else
		{if(rollno<0)
			System.out.println("Error: Roll number must be positive");
		else {
			if(grade>12||grade<0)
				System.out.println("Error: Grade level must be between 1 and 12");
			else {
				
				System.out.println("Name: "+name+"  Roll Number: "+rollno+"  Grade:"+grade);
			}
		}
			
		}
		
		
	}

}
*/