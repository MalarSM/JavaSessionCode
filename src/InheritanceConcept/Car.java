package InheritanceConcept;

public class Car extends Vehicle {
	
	int price = 500;
	
	public void start() {
		System.out.println("Car ----- Start");
	}
	
	public void laneMaintenance() {
		System.out.println("Car ----- lane maintenance");
	}
	
	
	public void cruiseControl() {
		System.out.println("Car ----- cruiseControl");
	}
	
	public void stop() {
		System.out.println("Car ----- cruiseControl");
	}
}
