package constructorConcept;

public class Employee {
	
	
	//constructor:
	//const...name will be same as class name, but function name could be anything
	//it looks like a function but its not a function
	//const.. cannot return anything can not be void also --there is no return type
	//avoid business logic in const.. but function should have busniss logic
	//const..is used to initialize the class (instance) variables with the help of local variables with this keyword
	//const can be overloaded, same with function also
	//const.. will be called automatically when we create the object of the class, function will be called using the object name or static function will be called using class name
	//const.. will help to restrict the object creation
	
	
	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isPerm;
//	public Employee() {//0 param const.. default const..
//		System.out.println("default const...");
//	}
//	
//	public Employee(int a) {//0 param const.. default const..
//		System.out.println("1 param const...");
//	}
	
	public Employee(String name, int age) {//2 param const.. default const..
		//global variable = local variable
		this.name = name;
		this.age = age;
	}
    
	public Employee(String name, int age,double salary, char gender) {
		//global variable = local variable
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		
	}
	
	public Employee(String name, int age, double salary, char gender, String dob, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
		this.isPerm = isPerm;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Malar",19);
		System.out.println(e1.name + " "+e1.age+" "+e1.salary+" "+e1.dob+" "+e1.isPerm);

		Employee e2 = new Employee("Mukil",19,20000.00,'f');
		System.out.println(e2.name + " "+e2.age+" "+e2.salary+" "+e2.gender+" "+e1.isPerm);
		
		Employee e3 = new Employee("Navir",2,300000.00,'m',"02-12-2021",true);
		System.out.println(e3.name + " "+e3.age+" "+e3.salary+" "+e3.gender+" "+e3.dob+" "+e1.isPerm);
		
	}

}
