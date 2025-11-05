package Day18practice;

public class GymMembershipSystem {
	private String name;
	private String type;
	private double fee;

	GymMembershipSystem(String name,String type,double fee){
		
		
		if(name==null||name.isEmpty()) {
			throw new IllegalArgumentException("Member name can not be empty");
			
		}
		if(type==null||type.isEmpty()) {
			throw new IllegalArgumentException("Plan type can not be empty");
		}
		if(fee<=0) {
			throw new IllegalArgumentException("Fee must be positive");
		}
		this.name=name;
		this.type=type;
		this.fee=fee;
		
	}

	public void displayMembership() {
		System.out.println("Member: "+this.name+",  Plan: "+this.type+", Fee: "+this.fee);

	}
}
