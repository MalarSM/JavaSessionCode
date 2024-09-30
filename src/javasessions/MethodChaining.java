package javasessions;

public class MethodChaining {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		MethodChaining.t1();
	}
	
	public void m4() {
		System.out.println("m3 method");
		MethodChaining.t1();
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		MethodChaining obj1 = new MethodChaining();
		obj1.m4();
	}
	
	//NS - NS : Direct calling(No object req)
	//S - S : Direct/Using class name
	//NS - S :Direct/Using class name
	//S - NS : create the object and then call it.(Slightly wrong)
	
	
	//JVM starting point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining obj = new MethodChaining();
		obj.m1();
		MethodChaining.t1();
	}

}
