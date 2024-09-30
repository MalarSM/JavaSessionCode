package javasessions;

public class NestedLoops {

	public static void main(String[] args) {
		//for --outer
		  //for --inner
		//Example : excel sheet rows and columns
		//web table
		
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//6*6  --> m*n 
		for(int i=0;i<=5;i++) {
			for(int j=0; j<=5; j++) {
				//System.out.println(i+""+j+"");
				System.out.print(i+""+j+" ");
				//break;
			}
			System.out.println();
		}
	}

}

//assignment 000 001 002 00