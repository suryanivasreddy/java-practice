package Day18practice;

public class AttendanceSystem {
private int id;
private String name;
private String attendanceStatus;

AttendanceSystem(int id ,String name ,String attendanceStatus){
	
	if(id<=0) {
		throw new IllegalArgumentException("ID must be positive");
	}
	if(name==null||name.isEmpty()) {
		throw new IllegalArgumentException("Name can not be empty");
		
	}
	if(!attendanceStatus.equalsIgnoreCase("present")&& !attendanceStatus.equalsIgnoreCase("absent")) {
		throw new IllegalArgumentException("Status must be \"Present\" or \"Absent\".");
	}
	this.id=id;
	this.name=name;
	this.attendanceStatus=attendanceStatus;
	
}

public void displayAttendance() {
	System.out.println("ID: "+this.id+",  Name: "+this.name+", Status: "+this.attendanceStatus);
	
}


}


/*

 Bright Future Academy – Attendance System
Question:
 Bright Future Academy is implementing a digital attendance system to track student presence.
 Each student has an ID, name, and attendance status (Present or Absent).
 The system must validate:
ID must be positive


Name must not be empty or null


Status must be either "Present" or "Absent"
 If any input is invalid, throw an exception.
 Create a method displayAttendance() to show details in the format:
 ID: [id], Name: [name], Status: [status].


Testcase-1
Input:
101
Emma Wilson
Present

Output:
ID: 101, Name: Emma Wilson, Status: Present

 Testcase-2
Input:
0
Liam Brown
Present

Output:
Error: ID must be positive

 Testcase-3
Input:
103
Olivia Davis
Late

Output:
Error: Status must be "Present" or "Absent"

 Testcase-4
Input:
104
Noah Lee
Absent

Output:
ID: 104, Name: Noah Lee, Status: Absent


*/