package javasessions;

public class DoWhilePractice {

	public static void main(String[] args) {
		//ASCII value a-z
		int ch = 'a';
		do {
			System.out.println(ch);//a
			ch++;
		}while(ch<='z');
		
		System.out.println("------");
		
		// z-a
		char h = 'z';
		do {
			System.out.println(h + ":"+(int)h);//a
			h--;
		}while(h>='a');
		
		System.out.println("------");
		char c = '0';
		do {
			System.out.println(c +":" +(int)c);
			c++;
		}while(c<='9');
		
	}

}
