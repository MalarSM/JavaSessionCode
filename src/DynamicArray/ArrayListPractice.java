package DynamicArray;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		ar.add(500);
		ar.add(1600);
		ar.add(700);
//		System.out.println(ar.size());//5
//		ar.remove(2);
//		System.out.println(ar.size());//4
//		System.out.println(ar.get(0));//300
		//System.out.println(ar.get(6)); IndexoutofboundException
		//Print all the value
		
		System.out.println(ar);
		
		System.out.println("-------");
		
		//use for loop:
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("-------");
		
		
	//ArrayList with Generics:
		ArrayList <Integer> numlist = new ArrayList <Integer>();
		numlist.add(100);
		numlist.add(1000);
		numlist.add(10000);
		System.out.println(numlist);
		System.out.println("-------");
		
		//for each:
//		for(Integer e: numlist) {
//			System.out.println(e);
//			if(e.equals(1000)) {
//				System.out.println("enter the value");
//				break;
//			}
//			
//		}
		
		System.out.println("-------"); 
		
		ArrayList <Double> marks = new ArrayList <Double>();
		marks.add(44.66);
		marks.add(30.00);
		marks.add(29.99);
		System.out.println(marks);
		System.out.println("-------");
		
		ArrayList <String> st = new ArrayList <String>();
		st.add("Malar");
		st.add("Mukil");
		st.add("Sam");
		st.add("Navir");
		System.out.println(st);
		System.out.println("-------");
		
		ArrayList <Object> empData = new ArrayList <Object>();
		empData.add("Malar");
		empData.add("699789789");
		empData.add("CHandler");
		empData.add("85224");
		System.out.println(empData);
		
		//Duplicate values are allowed:
		ArrayList <String> st1 = new ArrayList <String>();
		st1.add("Malar");
		st1.add("Malar");
		st1.add("Mukil");
		st1.add("Navir");
		st1.add(null);
		System.out.println(st1);
		st1.remove(1);
		System.out.println(st1);
		System.out.println("-------");
		
		ArrayList <String> footerList = new ArrayList <String>();
		footerList.add("contact us");
		footerList.add("help");
		footerList.add("delivery");
		footerList.add("cart");
		footerList.add("payment");
		
		//update:
		footerList.add(0, "malar");
		
		System.out.println(footerList);
//		 for (String e1 : footerList) {
//			 if(e1.equals("delivery")) {
//				 System.out.println("click on sendkey");
//				 break;
//				 
//			 }
//		 }
		
		
 	}

}
