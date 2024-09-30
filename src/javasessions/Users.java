package javasessions;

public class Users {
	
	String name;
	int age;
	String city;


	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Malar";
		u1.age = 30;
		u1.city = "CA";
		
		User u2 = new User();
		u2.name = "Vizhi";
		u2.age = 31;
		u2.city = "AZ";
		

		User u3 = new User();
		u3.name = "Navi";
		u3.age = 32;
		u3.city = "NJ";
		
		User u4 = new User();
		u4.name = "Mukil";
		u4.age = 33;
		u4.city = "IL";
		
		System.out.println(u1.name + " " +u1.age + " " +u1.city);
		System.out.println(u2.name + " " +u2.age + " " +u2.city);
		System.out.println(u3.name + " " +u3.age + " " +u3.city);
		System.out.println(u4.name + " " +u4.age + " " +u4.city);
		
		System.out.println("------");
		
		u1 = u2;
		System.out.println(u1.name + " " +u1.age + " " +u1.city);
		System.out.println(u2.name + " " +u2.age + " " +u2.city);
		System.out.println(u3.name + " " +u3.age + " " +u3.city);
		System.out.println(u4.name + " " +u4.age + " " +u4.city);
        
		System.out.println("------");
		
		u2 = u3;
		System.out.println(u1.name + " " +u1.age + " " +u1.city);
		System.out.println(u2.name + " " +u2.age + " " +u2.city);
		System.out.println(u3.name + " " +u3.age + " " +u3.city);
		System.out.println(u4.name + " " +u4.age + " " +u4.city);
		
	     
	    System.out.println("------");
			
	    u3 = u4;
	    System.out.println(u1.name + " " +u1.age + " " +u1.city);
	    System.out.println(u2.name + " " +u2.age + " " +u2.city);
		System.out.println(u3.name + " " +u3.age + " " +u3.city);
		System.out.println(u4.name + " " +u4.age + " " +u4.city);
		
		System.out.println("------");
		
	    u4 = u1;
	    System.out.println(u1.name + " " +u1.age + " " +u1.city);
	    System.out.println(u2.name + " " +u2.age + " " +u2.city);
		System.out.println(u3.name + " " +u3.age + " " +u3.city);
		System.out.println(u4.name + " " +u4.age + " " +u4.city);
		
	}

}
