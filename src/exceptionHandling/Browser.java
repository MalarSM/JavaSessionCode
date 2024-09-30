package exceptionHandling;

public class Browser {
	
	//amazon app
	public void search() {
		System.out.println("m1 method");
		cart();
		}
	
	//amazon app
	public void cart() {
		System.out.println("m2 method");
		try {
		bankPayment();
	}catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("some AE is coming...");
	}
	}
	//HDFC bank application: 3rd party system //throws keyword is used to supply the exception one method to another method
	public void bankPayment() throws ArithmeticException {
		System.out.println("bankPayment method");
		int i = 9/0;
	}
    
	
	//Caller method: User method : We should not add any try catch in main() method
	public static void main(String[] args) {
		Browser br = new Browser();
		br.search();
		System.out.println("Bye!");
	}

}
