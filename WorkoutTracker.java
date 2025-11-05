package Day18practice;

public class WorkoutTracker {

private String name;
private int steps;
private double calories;

WorkoutTracker(String name ,int steps,double calories){
	
	
	if(name==null||name.isEmpty()) {
		throw new IllegalArgumentException("User Name can not be empty");
		
	}
	if(steps<=0) {
		throw new IllegalArgumentException("Steps must be non-negative");
	}
	if(calories<=0) {
		throw new IllegalArgumentException("Calories burned must be non-negative");
	}
	this.name=name;
	this.steps=steps;
	this.calories=calories;
	
}

public void displayUserDetails() {
	System.out.println("User: "+this.name+",  Steps : "+this.steps+", Calories Burned: "+this.calories);

}
}

/*

 FitLife Gym – Workout Tracker
Question:
 FitLife Gym app tracks workouts.
 Each record stores user name, steps taken, and calories burned.
 Validate:
Name must not be empty or null


Steps and Calories must be non-negative
 Throw exception if invalid.
 Display using format:
 User: [name], Steps: [steps], Calories Burned: [calories].


Testcase-1
Input:
Sophie Green
10000
500.0

Output:
User: Sophie Green, Steps: 10000, Calories Burned: 500.00

Testcase-2
Input:
James White
-100
300.0

Output:
Error: Steps must be non-negative

 Testcase-3
Input:
Lily Brown
12000
-50.0

Output:
Error: Calories burned must be non-negative

 Testcase-4
Input:
Oliver Black
15000
600.0

Output:
User: Oliver Black, Steps: 15000, Calories Burned: 600.00


*/