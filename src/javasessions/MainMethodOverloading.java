package javasessions;

public class MainMethodOverloading {
	
	
	
   //JVM -- PSVM(String [])
   public static void main(String[] args) {
	   System.out.println("hello");
	   MainMethodOverloading.main(10);
		
	}
   
   public static void main(int a) {
	   System.out.println("hii" + a);
	   MainMethodOverloading.main(a,20);
  	}
   
   public static void main(int a, int b) {
	   System.out.println("bye" + (a+b));
  	}
}
