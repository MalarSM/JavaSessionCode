package javasessions;

public class PracticeSwitchCase {

	public static void main(String[] args) {
//		String env = "test";
//		switch (env) {
//		case "QA":
//			System.out.println("the test cases execute in the :"+ env);
//			break;
//		case "Stage":
//			System.out.println("the test cases execute in the :"+ env);
//			break;
//		case "Dev":
//			System.out.println("the test cases execute in the :"+ env);
//			break;
//		case "UAT":
//			System.out.println("the test cases execute in the :"+ env);
//			break;
//		case "prod":
//			System.out.println("the test cases execute in the :"+ env);
//			break;
//		default:
//			System.out.println("Dont execute the test cases");
//			break;
//		}
		//book Uber
		String uber = "SUV";
		switch (uber) {
		case "mini":
			System.out.println("Book the car :"+ uber);
			break;
		case "sedan":
			System.out.println("Book the car :"+ uber);
			break;
		case "SUV":
			System.out.println("Book the car :"+ uber);
			break;
		case "Premium":
			System.out.println("Book the car :"+ uber);
			break;
		default:
			System.out.println("please select the right car type" + uber);
			break;
		}

	}

}
