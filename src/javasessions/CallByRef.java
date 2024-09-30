package javasessions;

public class CallByRef {
	
	String name;
	int age;
    
	public void m1(int a) {
		System.out.println(a);
		
	}
	
	public static void t1(CallByRef p1) {
	   p1.m1(20);
	   System.out.println(p1.name);
		System.out.println(p1.age);
		
		p1.name ="Sam";
		p1.age = 50;
	}
	
	public static void main(String[] args) {
		
		CallByRef  obj = new CallByRef();
		obj.name = "Malar";
		obj.age = 34;
		 //obj.m1(10); //call by value /argument
		 
		 CallByRef.t1(obj);//call by reference
		 System.out.println(obj.name);
			System.out.println(obj.age);
      
	}

}
