package javasessions;

public class TestingStack {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
		System.out.println("bye");
	} 
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		
		
		TestingStack obj = new TestingStack();
		obj.m1();

	}

}
