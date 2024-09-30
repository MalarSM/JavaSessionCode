package javasessions;

public class TypeCastingConcept {

	public static void main(String[] args) {
		// byte, short, char, int , long, double, float
		//widening - lower data type to higher data type
		byte b = 10;
		short s = b;
		System.out.println(b);
		System.out.println(s);
		
		//Narrowing - losing the data
		short s1 =200;
		byte b1 = (byte)s1;
		System.out.println(b1);//-56
		
		short s2 =10;
		byte b2 = (byte)s2;//10 is coming within the range of byte
		System.out.println(b2);
		
		byte t1 = 10;
		int i = t1;
		System.out.println(i);
		
		int j=1000;
		byte k = (byte)j;
		System.out.println(k);

	}

}
