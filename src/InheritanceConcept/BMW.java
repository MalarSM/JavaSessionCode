package InheritanceConcept;

public class BMW extends Car  {
	
	//Method Overriding:poly(many)+Morphism(forms)RunTime (dynamic)
	//When we have a method in parent class and the same method in child class.
	//1.with the same name
	//2.with the same number of parameters
	//3.with the same sequence of parameters also matter
	//4.buss logic/numbers of lines in the method -- doesn't matter
	//5.with the same return type 
	//6.static methods can not be overridden.
	//7.Private/Final methods cannot be overridden.
	
	@Override
	public void start() {
		System.out.println("BMW ----- Start");
	}
	
	public void speedTracking() {
		System.out.println("BMW ----- Speedtracking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW ----- engine");
	}
	
	public void bmwLoading() {
		Truck tr = new Truck();//BMW class is having truck class object and able to access its methods : Composition
		tr.heavyLoading();
		
	}
 
	
}
