package encapsulationConcept;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getAge() {
		return age;
	}
    public void setAge(int age) {
		this.age = age;
	}
    public String getGender() {
		return gender;
	}
    public void setGender(String gender) {
		this.gender = gender;
	}
    public void printInfo(String name, int age, String gender) {
    	System.out.println("Person name :"+ name);
    	System.out.println("Person age :"+ age);
    	System.out.println("Person gender :"+ gender);
    }


	public static void main(String[] args) {
		Person p = new Person();
		p.printInfo("Malar", 34, "f");
	}

}
