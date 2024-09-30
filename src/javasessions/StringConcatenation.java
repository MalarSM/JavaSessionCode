package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
//Examples of string concatenation using the "+" operator
//String is a in-built class that represents a sequence of characters
//System is a class, out is variable, and println() is method.
//execution happens left to right , the placement of the string matters while printing to get the correct data
		
		String m= "Hello";
		String msg = "This is my java code";
		System.out.println(m + msg); //HelloThis is my java code
		
		int a= 10;
		int b= 20;
		System.out.println(a+b); //30
		System.out.println(a+b+m); //30Hello
		System.out.println(m + (a+b));//Hello30
		System.out.println(a+b+m+msg);//30HelloTHis is my java code
		System.out.println(a+b+"Tester");//30Tester
		System.out.println("Tester"+a+b);//Tester1020
		System.out.println("Tester"+(a+b));//Tester30
	}

}
