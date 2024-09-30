package AccessModifier2;

import AccessModifier1.Car;

public class Truck {
	
	String color;
	public String name;
	protected int price;
	private double milage;

	public static void main(String[] args) {
		Car c = new Car();
	    
		
		Truck tr = new Truck();
		tr.color = "ash";
		tr.milage = 100.88;
		tr.price = 90000;
		tr.name = "Tesla";
		
		System.out.println(tr.color);
		

	}

}
