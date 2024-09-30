package AccessModifier1;

public class Car {
	
	String name;
	public int price;
	protected String color;
	private String chasisNum;
	
	public void billing() {
		System.out.println("billing Car..");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.chasisNum= "123";
		
		
	
	}

}
