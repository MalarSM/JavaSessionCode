package AccessModifier1;

public class Banana extends fruits {
	
	public static void main(String args) {
		
		Banana bn = new Banana();
		
		bn.taste();//default
		bn.weight();//public 
		bn.price();//protected
	
	}
	
	

}
