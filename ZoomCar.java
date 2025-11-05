package Day18practice;

public class ZoomCar {
private String brand;
private String model;
private double price;
ZoomCar(String brand, String model, double price){
	if(brand==null||brand.isEmpty()) {
		throw new IllegalArgumentException("Brand name can not be empty");
	}
	if(model==null||model.isEmpty()) {
		throw new IllegalArgumentException("Model name can not be empty");
		
	}
	if(price<=0) {
		throw new IllegalArgumentException("Price must be Positive.");
	}
	this.brand=brand;
	this.model=model;
	this.price=price;
	
}

public void displayCarInfo() {
	System.out.println("Brand: "+this.brand+",  Model: "+this.model+", Price per Day: "+this.price);
	
}

}
