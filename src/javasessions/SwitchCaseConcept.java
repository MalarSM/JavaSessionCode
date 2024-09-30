package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		//cross browser logic
		// String is case sensitive
		//use cases of switch case
		//1.cross OS logic
		//2.month
		//3.cross users/RABC user permissions
		//4.run test cases in diff env dev, qa,uat
		//5.timezones
		
//		String browser = "chrome";
//		switch (browser) {
//		case "chrome":
//			System.out.println("lanuch chrome");
//			break;
//		case "firefox":
//			System.out.println("lanuch firefox");
//			break;
//		case "edge":
//			System.out.println("lanuch edge");
//			break;
//		case "ie":
//			System.out.println("lanuch ie");
//			break;
//
//		default:
//			System.out.println("Please pass the right browser :" + browser);
//			break;
//		case "opera":
//			System.out.println("lanuch opera");
//			break;
//		}
		
		//Switch case is applicable for byte, short, int, char, String
		//long, float, double : Not applicable
		
		char ch = 'b';
		switch (ch) {
		case 'a':
			System.out.println("a is vowel :" + ch);
			break;
		case 'e':
			System.out.println("e is vowel :" + ch);
			break;
		case 'i':
			System.out.println("i is vowel :" + ch);
			break;
		case 'o':
			System.out.println("o is vowel :" + ch);
			break;
		case 'u':
			System.out.println("u is vowel :" + ch);
			break;
		default:
			System.out.println("This is consonent:" + ch);
		}

	}

}
