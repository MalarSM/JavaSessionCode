package javasessions;

public class Employee {
	
	//class: is a category /template / blueprint to create an object
	//Object: physical entity
	
	//instance variable/class variables/ global variables/template variables
	String name;
	int age;
	double salary;
	boolean isPerm;
	char gender;

	public static void main(String[] args) {
		
		// create the object: using new keyword
		// Object is called as instance of the class
		// new is a keyword
		//Object is "new Employee()"
		
		
		Employee obj = new Employee(); //Right is the object , obj is name of the object
		System.out.println(obj.name);
		System.out.println(obj.isPerm);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		
		System.out.println("-----");
		
		obj.name = "Malar";
		obj.age = 34;
		obj.salary = 90000;
		obj.isPerm = true;
		obj.gender = 'f';
		
		System.out.println(obj.name);
		System.out.println(obj.isPerm);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		
		//no reference object - not a good practice
		//new Employee().name = "Tom";
		
		//Employee t1 = new Employee();
		//t1= null;
		//t1.name = "Naveen"; //null pointer exception
		//System.out.println(t1.name);
		
		//System.gc();//there is no fix guarantee that it will call gc..
	}

}
