package AccessModifier1;

import AccessModifier2.Truck;

public class fruits {
	
	void taste() {
		
		System.out.println("fruits --- taste");
		
	}
	
	public void weight()
	{
		System.out.println("fruits --- weight");
	}
	
	private void fresh()
	{
		System.out.println("fruits --- fresh");
	}
	
	protected void price()
	{
		System.out.println("fruits --- price");
	}
	
	public static void main(String[] args) {
		
		fruits fr = new fruits();
		fr.taste();
		fr.price();
		fr.fresh();
		fr.price();
		
		Truck tr2 = new Truck();
	
		tr2.name = "RAM500";
		

	}

}
