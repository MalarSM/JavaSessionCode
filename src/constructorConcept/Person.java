package constructorConcept;

public class Person {
	
	String name;
	int age;
	char gender;
	double height;
	public Person(String name, int age, char gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	public static void main(String[] args) {
		Person p1 = new Person("Malar", 34, 'f', 152.00);
		System.out.println("name :" + p1.name +" " + "age :" + p1.age +" " + "gender :" + p1.gender +" "+ "height :" +p1.height);
	}

}
