package javasessions;

import java.util.Arrays;

public class StaticArrayConcepts {

	public static void main(String[] args) {
		
		//two major limitation:
		//1.fixed size of an array(static array)
		//2.It can store only similar kind of data(to overcome this we can use Object array but still its static array)
		//3.Overcome above problem we will use arraylist.
		//Static array examples:
		//1.Flight booking, movie tickets, month drop down[12]
		
		
		int i[] = new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;

		//Index based loop;
		
		
		//double array;
		double d[] = new double[3];
		d[0]=12.66;
		d[1]=23.99;
		d[2]=100.99;
		for(double e : d) {
			System.out.println(e);
		}
		
		System.out.println("-----"); 
		//char array;
			char ch[]= new char[4];
			ch[0]='a';
			ch[1]='e';
			ch[2]='i';
			ch[3]='o';
			for(char e : ch) {
				System.out.println(e);
			}
		System.out.println(Arrays.toString(ch));
		System.out.println(ch);	

		System.out.println("-----"); 
		//String Array:
		String emp[] = new String[3];
		emp[0]="Tom";
		emp[1]="Malar";
		emp[2]="Manasi";
		for(String e : emp) {
			System.out.println(e);
			if(e.equals("Malar")) {
				System.out.println("emp is automation tester");
				break;
			}
		}
			//Object array:
			Object data[]=new Object[5];//0-4
			data[0]="Tom";
			data[1]=30;
			data[2]='m';
			data[3]=3000.99;
			data[4]=true;
			System.out.println(Arrays.toString(data));
			
			for(Object e : data) {
				System.out.println(e);
			}
			for(int k=0;k<=data.length-1;k++) {
				System.out.println(data[k]);
			}
			System.out.println("-----"); 
	//
	int p[] = new int[4];
	p[0]= 10;
	p[1]= 20;
	p[2]= 30;
	p[3]= 40;
	
	for(int k=p.length-1;k>=0;k--) {
		System.out.println(p[k]);
	}
	
	System.out.println("-----"); 
	
	int count=p.length-1;//3
	for(int e :p) {
		e = count;
		System.out.println(p[e]);
		count--;
	}
	
	//Array Literals: static array:
	int num[]= {10,20,30,40,50};//if we have the data
	System.out.println(num.length);

	}
}
