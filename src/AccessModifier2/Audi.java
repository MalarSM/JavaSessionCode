package AccessModifier2;

import AccessModifier1.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		
		Audi a = new Audi();
		Truck tr1 = new Truck();
		tr1.color = "Green";
		tr1.name = "RAm";
		tr1.price = 90;
		
		System.out.println(tr1.color);
		
		

	}

}
