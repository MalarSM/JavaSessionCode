package stringManipulation;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		 
		String str = "Hi this is my java code and I am so happy";
          System.out.println(str.length());
          int len = str.length();
          
          System.out.println("Li = " + 0);
          System.out.println("Hi = " + (str.length()-1));
          
          System.out.println(str.charAt(0));
          System.out.println(str.charAt(2));
          System.out.println(str.charAt(40));
          //System.out.println(str.charAt(41));//String index out of bound exception
          //System.out.println(str.charAt(-1));//IOBE
          System.out.println(str.indexOf('h'));
          System.out.println(str.indexOf('i'));//1st occurrence of i
          System.out.println(str.indexOf('i', 2));
          System.out.println(str.indexOf('i', str.indexOf('i') + 1));//2nd occurrence of i
          
          int p2 = str.indexOf('i', str.indexOf('i') + 1);
          System.out.println(p2);
          
          System.out.println(str.indexOf('i', p2+1) );////3rd occurrence of i
          
          System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1)+1) );//3rd occurrence of i
          System.out.println(str.indexOf("java"));
          System.out.println(str.indexOf("Java"));//-1
          
          System.out.println("--------------");
          
          String mesg = "welcome admin";
          
          if(mesg.indexOf("admin") == 8) {
        	  System.out.println("admin is present --- pass");
          }else {
        	  System.out.println("admin is present --- fail");
          }
          
          String m1 = "Save up to 50% with these current Sears coupons for January 2024."
          + "Discover the current Sears coupons and promo codes here to save BIG.";
          
          if(m1.indexOf("January 2024")>=0) {
        	  System.out.println("PASS");
          }
          
          //
          String t1 = "    Hello world   ";
          System.out.println(t1.trim());
          
          //Lower case and upper case:
          String l1 = "hello java world";
          System.out.println(l1.toUpperCase());
          System.out.println(l1.toLowerCase());
          
          //replace:
          String dob = "01-01-1990";//01/01/1990
          System.out.println(dob.replace("-", "/"));
          
          String t2 = "  hello world  ";
          System.out.println(t2.replace(" ", ""));
          
          //contains:
          String test = "I love Java Coding";
          System.out.println(test.contains("Java"));
          System.out.println(test.contains("java"));
          
          if (test.contains("Java")) {
        	  System.out.println("PASS");
          }else {
        	  System.out.println("FAIL");
          }
          
          //equals:
          String r1 = "Hello Selenium";
          String r2 = "Hello selenium ";
          
          System.out.println(r1.equals(r2));
          
          System.out.println(r1.equalsIgnoreCase(r2.trim()));//true
          
          //split:
          String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
          
         String lg[] = lang.split("_");
         System.out.println(lg[0]);
         System.out.println(lg.length);
         System.out.println(Arrays.toString(lg));
         
         String pop = "MalarxXHelloXxXSelenimxXTestingXxXGoogleX";
         
         String pp[]= pop.split("xX");
         System.out.println(pp[0]);
         System.out.println(pp[1]);
         System.out.println(pp[2]);
         System.out.println(pp[3]);
         System.out.println(pp[4]);
         System.out.println(Arrays.toString(pp));
         
         System.out.println("malar;mukil;navir".split(";")[0]);
         
         String otp = "your otp number is 12345";
         String ot[] = otp.split(" ");
         System.out.println(ot[ot.length-1]);
	}

}
