package DataConversation;

public class StringIntern {

	public static void main(String[] args) {
		String s = new String("Hello Java");//heap -1 and SCP -1
		String s1 = s.intern();
		System.out.println(s1);
		System.out.println(s);
		System.out.println(s == s1);
		System.out.println(s.equals(s1));

	}

}
