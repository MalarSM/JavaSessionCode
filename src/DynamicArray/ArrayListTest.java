package DynamicArray;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		//List(I) --->ArrayList(c)
		//Default VC for array list --> 10
		//AL: it maintains the order/index
		//AL: default virtual capacity = 10
		//Load factor = Current physical capacity/2
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//Index - 0
		ar.add(200);//Index - 1
		
		System.out.println(ar.size());//2
		
		ar.add(200);//Index - 2
		ar.add(400);//Index - 3
		
		System.out.println(ar.size());//4
		
		ArrayList ar1 = new ArrayList(5);//VC=5,PC=0
		ArrayList ar2 = new ArrayList(50);//VC=50,PC=0
	}

}
