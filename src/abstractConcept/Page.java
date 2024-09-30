package abstractConcept;

public abstract class Page {
	//we can have both abstract and non abstract methods in a class
	//0% abstraction -- yes
	//100% abstraction -- yes
	//partial abstraction -- yes
	//abstract methods
	//Can we have constructor of the abstract class: this is allowed
	
	
	//this is mandatory if you have any parameterize constructor in the parent class
	public Page() {
		System.out.println("Page constructor ... default");
	}
	
	public Page(int a) {
		System.out.println("Page constructor " + a);
	}

	public abstract void title();
	public abstract void url();
	
	//non abstract methods
	public void loading(){
		System.out.println("Page loading 20s");
	}
	
	public final void displayLogo(){
		System.out.println("My logo.jpg");
	}
}
