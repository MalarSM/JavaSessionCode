package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		//Tc: Big Oh()--Big 0()
		//To calculate the time complexity
		
		int i=1;
		System.out.println(i);
		
		System.out.println("------");
		//0(1) --constant time
		//2. 100 secs --->0.00001
		
		
		for(int p=1; p<=10; p++) {
			System.out.println(p);
		}
        //1+n+n+n ==> 3n+1 -->Linear equation n+c
		//3n+1 ==> 3n --> O(n)
      int k = 1;
      while (k<=10) {
    	  System.out.println(k);
    	  k++;
      }
	
      //1+n+n+n ==>3n+1 ==>3n ==>n ==>0(n)
	
      for(int n=0;n<=5;n++) {
			for(int m=0; m<=5; m++) {
				//System.out.println(i+""+j+"");
				System.out.print(n+""+m+" ");
				//break;
			}
			System.out.println();
		}
      
      //(1+n+n+n)(1+n+n+n)-->(1+3n)(1+3n)->

      
      
      
      //log : n 
      //n=32
      //n/2=16
      //n/4=4
      //n/8=2
      
      //tc = n/k
      //T = n/k
      
	}
	

}
