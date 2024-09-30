package constructorConcept;

public class Car {
	
	String name;
	String color;
	double price;
	String model;
	String chasisNumber;
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Car(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
 
	public Car(String name, String color, double price, String model) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
	}

	
	public Car(String name, String color, double price, String model, String chasisNumber) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.chasisNumber = chasisNumber;
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("BMW", "white");
		Car c2 = new Car("Honda","Blue", 60.44);
		Car c3 = new Car("Honda","Blue", 40.44,"Civic");
		Car c4 = new Car("Audi","red", 60.44,"Q3","12345");
		
		
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+c1.model+" "+c1.chasisNumber);
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+c2.model+" "+c2.chasisNumber);
		System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+c3.model+" "+c3.chasisNumber);
		System.out.println(c4.name+" "+c4.color+" "+c4.price+" "+c4.model+" "+c4.chasisNumber);
		

	}

}
