package DataConversation;

import java.util.Arrays;

public class DataConvert {

	public static void main(String[] args) {
		//String to int:
		String x = "100";
		System.out.println(x+20);//10020
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);//120
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		String y = "100A";
		int j = Integer.parseInt(y.replace("A", ""));//100A NumberFormatException
		System.out.println(j+20);//NumberFormatException
		
		String totalPrice = "1000";
		int price = Integer.parseInt(totalPrice);
		System.out.println(price - 100);
		
		//String to double:
		String s = "100.33";
		System.out.println(s+20);
		double d = Double.parseDouble(s);//100.33
		System.out.println(d+20);
		
		//int to String:
		int t =100;
		System.out.println(t+20);//120
		String e = String.valueOf(t);//100
		System.out.println(e+20);//10020
		
		//double to String
		double marks =100.22;
		String m = String.valueOf(marks);//100.22
		System.out.println(m+20);//100.2220
		
		//char to String
		char ch ='A';
		String cs = String.valueOf(ch);//"A"
		System.out.println(cs+20);
		
		//String to boolean:
		String tr ="true";//TRUE/true/True
		boolean flag = Boolean.parseBoolean(tr);//true
		System.out.println(flag);
		if(flag) {
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		//boolean to String:
		boolean gr = true;
		String yr = String.valueOf(gr);//true
		System.out.println(yr+10);//true10
		
		char cd[] = {'s','e','l','e','n','i','u','m'};
		String td = String.valueOf(cd);
		System.out.println(td);
		
		
		Integer v = 100;
		Integer v1 = 100;
		
		if(v==v1) {
			System.out.println("hi");
		}
		if(v.equals(v1)) {
			System.out.println("hello");
		}
		System.out.println(v+20);//120
		int v2 = v.intValue();
		System.out.println(v2);
		
		
		//primitive data compare : ==
		//non primitive data compare : .equals
		
		String rest = "I love \"Java\"code"; //I love "Jave" code
		System.out.println(rest);
		
		String xpath = "//input[@name=\"malar\"]";
		System.out.println(xpath);
		
		String data ="Malar;Sam;6692959094;chandler";
		String info[] = data.split(";");
		System.out.println(Arrays.toString(info));
		
		String data1 ="Malar|Sam|6692959094|chandler";
		String info1[] = data1.split("\\|");
		System.out.println(Arrays.toString(info1));
		
		String data2 ="Malar.Sam.6692959094.chandler";
		String info2[] = data2.split("\\.");
		System.out.println(Arrays.toString(info2));
		
		//int --> wrapper class Integer
		//double --> wrapper class Double
		//boolean --> wrapper class Boolean
		
		//String is not a wrapper class
	}

}
