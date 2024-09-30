package constructorConcept;

public class EmployeeConst {
	
	int id;
	String name;
	double salary;
	
	public EmployeeConst(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    
	public int getId() {
		return id;
	}
    public String getName() {
		return name;
	}
    public double getSalary() {
		return salary;
	}
    public void setSalary(double salary) {
		this.salary = salary;
	}

    public static void main(String[] args) {
    	EmployeeConst emp = new EmployeeConst(01, "Malar", 20000.00);
    	System.out.println("Employee Information");
    	System.out.println("Emp ID : "+ emp.getId());
    	System.out.println("Emp ID : "+ emp.getName());
    	System.out.println("Emp ID : "+ emp.getSalary());
    	
    	double raisePercentage = 0.10;
    	double raiseAmt = emp.getSalary()* raisePercentage;
    	double newSalary = emp.getSalary() + raiseAmt;
    	emp.setSalary(newSalary);
    	System.out.println("After  10% salary raise : "+emp.getSalary());
    	
		

	}

}
