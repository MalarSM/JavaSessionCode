package stringManipulation;

public class StringCompare {

	public static void main(String[] args) {
	
		//String literals
		
		String s1 = "hello seleinum";
		
		//using new
		String s2 = new String( "hello seleinum");
		
		System.out.println(s1 ==s2);
		System.out.println(s1.endsWith(s2));

		String s3 = "hello seleinum";
		System.out.println(s1 ==s3);
		System.out.println(s1.endsWith(s3));
		System.out.println(s2 ==s3);//false
		
		String s4 = "hello Seleinum";
		
		String str = new String("testing");//1 normal object and 1 string constant pool in heap, so two values are created in memory(scp + heap)
		String st = "testing";//SCP --> 0
		String st1 = "Testing";//SCP ---> 1
		
		//
		String t1 = "hello";
		t1.concat("automation");
		System.out.println(t1);//hello
		
		String t2 = "helloautomation";
		System.out.println(t1.equals(t2));//false
		
		String t3 = new String("cypress");//2 objects --> (SCP + Heap)
	}

}
