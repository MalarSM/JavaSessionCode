package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i =9/0;
		}catch(ArithmeticException e) {
			System.out.println("AE is coming..");
			}
		finally {
			System.out.println("Im in finally block");
		}
		
		System.out.println("Bye!--");
		
		//use case:
		//1.make the connection DB : un, pwd, ip: port
		//2.hit the SQL query
		//3. result from DB
		//4.display the data on UI
		//5.{ close connection with DB :} finally block
		
		//reading from excel/file
		

	}

}
