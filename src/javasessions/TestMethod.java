package javasessions;

public class TestMethod {

	public void getMail() {
		
	}
   public static void sendMail() {
	   System.out.println("Send mail");
		
	}
   public static void sendMail(int a) {
	   System.out.println("Send mail1");
		
	}
   public static void sendMail(int a, int b) {
	   System.out.println("Send mail2");
		
	}
   public void sendMail(String b) {
	   System.out.println("Send mail3");
		
	}
	public static void main(String a[]) {
		
		System.out.println(a.length);
		//System.out.println(a.length);
		//how to call static methods:
		//1.using the class name
		TestMethod.sendMail();
		//2.within the same class use it directly;
		sendMail();
		
		//how to call non static methods: we need to create the object
		
		TestMethod obj = new TestMethod();
		obj.getMail();
		
		//obj.sendMail();//warning -- not recommend

	}

}
