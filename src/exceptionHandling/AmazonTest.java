package exceptionHandling;

public class AmazonTest {

	public static void main(String[] args) {
		String browser = "qqq";
		
		switch(browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		
	    case "firefox":
		System.out.println("launch firefox");
		break;
		
	    case "safari":
			System.out.println("launch safari");
			break;
			
	    case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("pls pass the right browser..." +browser);
			throw new MyException("====WRONG BROWSSER PASSED===");
		}
			System.out.println("launch url");
			System.out.println("login to app");
			System.out.println("shop a product");
			System.out.println("close browser");
		}
	}


