package InterfaceConcept;

public interface USMedical {
	
	int MIN_FEE = 10;
	//interfaces variables are static and final in the nature by default
	//only method declaration: no method body
	//only method prototype
	//abstract methods: a method without body
	//can not create the object for an interface
	
	public void physioServices();
	public void orthoServices();
	public void entServices();
	public void emergencyServices();
	
	//can I have a method with body? : yes
	//after JDK 1.8
	//1.Can have a method with body but with static method
	public static void billing() {
		System.out.println("US Medical -- billing");
	}
	
	//2. can have a non static with method body with default keyword
	//can we override the default method of interface
	default void medicalInsurance() {
		System.out.println("US Medical -- medical Insurance");
	}
	
	//private non static method: abstract?--Private method cannot be overriden
	//private void freeMedical();
	
	//final method: abstract? -- not allowed
	//public final void medicalResults();
	

}
