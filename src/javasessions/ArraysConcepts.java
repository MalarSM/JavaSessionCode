package javasessions;

import java.util.Arrays;

public class ArraysConcepts {

	public static void main(String[] args) {
		//Array means similar type of data in a collections
		//Two types of array are static and dynamic
		//Static : size is fixed
		//Dynamic : size is not fixed : ArrayList
		//lowerindex always 0
		//Length = Heightindex + 1
		//Hi =lenght - 1
		//Declaration: using new keyword
		int i[] = new int[4];
		System.out.println(i[0]);//0
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		System.out.println(i[0]);
	//	System.out.println(i[-1]);//ArrayIndexoutofbound exception
		//System.out.println(i[4]);//ArrayIndexoutofbound exception
		// to print all the value of array: use for loop
		System.out.println("Li ="+ 0);
		int len =i.length;
		System.out.println("Length ="+ len);
		System.out.println("Length ="+ (len-1));
		
		//for(int j=0; j<=3;j++) {
			//System.out.println(i[j]);
			
//			for(int k=0; k<=len-1;k++) {
//				System.out.println(i[k]);
		
//		for(int l=0; l<=i.length-1;l++) {
//			System.out.println(i[l]);
//		}
		
		for(int l=0; l<i.length;l++) {
			System.out.println(i[l]);
		}
	
		//without for loop. I wanted to print the values of array:
		System.out.println(Arrays.toString(i));
		
		//
		
		System.out.println("----------------");
		int p[]=new int[3];
		p[1]=100;
		p[2]='a';
		System.out.println(p[1]);
		System.out.println(p[0]);
		System.out.println(p[2]);
		System.out.println(Arrays.toString(p));
	}

}
