package javasessions;

public class IfElseConcept {

	public static void main(String[] args) {

//		System.out.println(10==30);
//		int a = 10;
//		int b = 20;
//		
//	if(a>b) {
//		System.out.println("a is greater than b");
//		}
//	else {
//		
//		System.out.println("b is greater than a");
//	}

//performance issue(unnecessary checking all the condition), 
//	String browser = "opera";
//	
//	if(browser.equals("chrome")) {
//		System.out.println("chrome is launched");
//	}
//    if(browser.equals("ie")) {
//    	System.out.println(" ie is launched");
//    }
//    if(browser.equals("firefox")) {
//    	System.out.println(" firefox is launched");
//    }
//    else {
//    	System.out.println("pass the correct browser :" + browser );
//    }
//	}

//this code also having performance issue
		String browser = "ie";
		if (browser.equals("chrome")) {
			System.out.println("chrome is launched");
		} else if (browser.equals("ie")) {
			System.out.println(" ie is launched");
		} else if (browser.equals("firefox")) {
			System.out.println(" firefox is launched");
		} else {
			System.out.println("pass the correct browser :" + browser);
		}
	}
}
