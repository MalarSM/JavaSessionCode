package encapsulationConcept;

public class TestEmp {

	public static void main(String[] args) {
		
		
		//Create - Post
		Employee obj = new Employee("Malar",34,20.00, true);
		
		//Retrieve -- GET
		System.out.println(obj.getName() + " " + obj.getAge() + " "+obj.getSalary() + " " +obj.isPerm());
	
        //Update -- PUT
		obj.setAge(35);
		obj.setSalary(30.00);
		System.out.println(obj.getName() + " " + obj.getAge() + " "+obj.getSalary() + " " +obj.isPerm());
		
		System.out.println("-----------");
		//Browser class:
		Browser br = new Browser();
		br.launchBrowser();
	}

}
