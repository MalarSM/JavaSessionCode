package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//repeat task
		//1 to 10
		//1.while loop
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
			//break;
		}
		
//		int k=100;
//		while(k>=50) { //infinity loop
//			System.out.println("hello");
//		}
		
		//1 to 50
		int p=1;
		while(p<=50) {
			System.out.println(p);
			if(p==5) {
				System.out.println("bye");
				break;
			}
			p++;
		}
		
		//10 to 1
		int t = 10;
		while(t>=1) {
			System.out.println(t);
			//--t;
			//t--;
			t=t-1;
		}
    System.out.println("--------");
		//2. for loop
		//1 to 10
		for(int d = 1; d<=10; d++) {
			System.out.println(d);//12
		}
    System.out.println("-------");
    
    for(int d = 1; d<=10; ) {
	System.out.println(d);//12
	d++;
}
    System.out.println("-------");
    
    for(byte b=1; b<=10; b++) {
    	System.out.println(b);
    }

    System.out.println("-------");
    
    for(char ch='a'; ch<='z'; ch++) {
    	System.out.println(ch);
    }
    
 System.out.println("-------");
    //ASC value 
    //Print a - z
    for(char ch='a'; ch<='z'; ch++) {
    	System.out.println(ch + "=" +(byte)ch);
    }
    
    //double:
    //Use case : Build number
    for(double d=1.0 ; d<=5.0; d++) {
    	System.out.println(d);
    }
    
    //When to use while loop
    //when number of iterations are not fixed, then we use while loop
    //Ex: Calendar handling, infinite scrolling on facebook, linkedin, swiggy, zomato
    //wait for element on the page : 5, 10, 12, 15, 20 secs
    //wait for page loading : when page is loaded break the loop
    //web table with the pagination
    //carousels
    
    //when to use for loop:
    //when number of iterations are fixed, then we use while loop
    //month drop down : 1 to 12
    //country drop down 
    //Arrays, Arraylist: for loop
    //footer links on web page
    //drop downs with fixed data
    //movie ticket for a movie : 120 seats
    //flight tickets
    
//    for(;;) {//if no condition present the default it takes true
//    	System.out.println("welcome to hotel TAJ");
//    }
//    
	}

}

