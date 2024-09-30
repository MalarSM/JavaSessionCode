package exceptionHandling;

public class TestingFinally {
	
	
	public static int getMarks(String studentName) {
		System.out.println("getting marks: " + studentName);
		
		if (studentName.equals("Malar")) {
			try {
				int i = 9/3;
				System.exit(0);//shutdown the JVM
			}catch(ArithmeticException e) {
				System.out.println("AE is coming..");
				return 10;
			}
			finally {
				System.out.println("bye!!");
				return 30;
			}
			
		}
		else if (studentName.equals("Mukil")) {
			return 100;
		}
		else if (studentName.equals("Navir")) {
			return 90;
		}
		else {
			System.out.println("no student found..");
			try {
				int p = 9/0;
			}finally {
				return 5;
			}
			
		}
	}

	public static void main(String[] args) {
		
		int m1 =TestingFinally.getMarks("Test");
		System.out.println(m1);
		

	}

}
