package javasessions;

public class DoWhileLoop {

	public static void main(String[] args) {
		//1 to 10
		int i = 1;
		do {
			i++;
			System.out.println(i);
			//break;
		}
		while(i<=10);
		
		//use cases:
		//1.wait for the element:
		System.out.println("-------");	
		int p = 10;
		do {
			System.out.println(p);//109876543210
			p--;
		}
		while(p>=0);
    
		System.out.println("-------");	
		//even number 
		for(int k=1; k<=100; k++){
		if(k % 2 ==0) {
			System.out.println(k);
		}
	}
		System.out.println("-------");
		//odd number
		for(int k=1; k<=100; k++){
			if(k % 2 ==1) {
				System.out.println(k);
			}
		}
		//even
		System.out.println("-------");
		for(int e=0; e<=10; e=e+2) {
			System.out.println(e);
		}
		//odd
		System.out.println("-------");
		for(int f=1; f<=10; f++) {
			System.out.println(f);
			f++;
		}
	}
}
