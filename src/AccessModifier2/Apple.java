package AccessModifier2;

import AccessModifier1.fruits;

public class Apple extends fruits {

	public static void main(String[] args) {
		
		Apple ap = new Apple();
		ap.weight();//public
		ap.price();//protected
		
		
	}

}
