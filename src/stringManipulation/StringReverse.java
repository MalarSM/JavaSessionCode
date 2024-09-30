package stringManipulation;

public class StringReverse {
	
	public static String reverse(String st) {
		
		//null check
		if(st == null) {
			throw new RuntimeException("VALUE CAN NOT BE NULL");
		}
		
		//length == 1
		if(st.length() == 1 || st.length() == 0) {
			return st;
		}
		
		int len =st.length();//8
		String rev ="";
		for(int i=len-1; i>=0; i--) {
			rev = rev + st.charAt(i);//muineles
		}
		return rev.trim();
	}
	
	

	public static void main(String[] args) {
		
		//String str = "selenium";
		//String m1 = reverse(str);
		//System.out.println(m1);
		
		System.out.println(reverse("testing"));
		System.out.println(reverse("T"));
	    //System.out.println(reverse(null));//null pointer exception
		System.out.println(reverse(""));//""
		System.out.println(reverse(" "));//""
		System.out.println(reverse("123"));//321
		System.out.println(reverse("null"));//llun

	}

}
