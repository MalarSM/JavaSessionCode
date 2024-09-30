package exceptionHandling;

public class Student {
	
	public void m1() {
		System.out.println("m1");
		m2();
	}
	public void m2() {
		System.out.println("m2");
		m1();
	}

	public static void main(String[] args) {
		
		Student st = new Student();
		
		try {
		st.m1();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverflowError error is coming..");
		}
      System.out.println("bye");
	}

}
