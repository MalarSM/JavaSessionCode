package InheritanceConcept;

public class Audi extends Car {
	
	@Override
	public void stop() {
		System.out.println("audi ----- stop");
	}
	
	public void autoBreaking() {
		System.out.println("audi ----- autoBreaking");
	}

}
