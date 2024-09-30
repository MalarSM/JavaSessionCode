package javasessions;

public class Car {
	
	String name;
	String modelNumber;
	int price;
	static final int wheels = 4; //static class variable
    static final int keys = 2;
	
	public static void main(String[] args) {
		
		//static int i = 10; //local variable cannot be static
		
		 final int days = 7;
		 //days = 10;
	    int totalSalary = days * 100;
	    System.out.println(totalSalary);
		
		
          Car c1 = new Car();
          c1.name = "BMW";
          c1.price = 60;
          c1.modelNumber = "x3";
          
          
          Car c2 = new Car();
          c2.name = "Audi";
          c2.price = 65;
          c2.modelNumber = "q2";
          
          
          Car c3 = new Car();
          c3.name = "Honda";
          c3.price = 10;
          c3.modelNumber = "civic";
         
          //how to access static variable: 
          //1. using the class name:
          System.out.println(Car.wheels);
          //2. using directly - not proper way
          System.out.println(wheels);
          
          //can not be changed bcoz of final
          //Car.wheels = 5;
          //Car.keys = 3;
          
          
        //how to access non static variable:
          System.out.println(c1.name + " " + c1.price + " " + c1.modelNumber);
          System.out.println(c2.name + " " + c2.price + " " + c2.modelNumber);
          System.out.println(c3.name + " " + c3.price + " " + c3.modelNumber);
	}

}
