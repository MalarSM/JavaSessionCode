package MapTesting;

import java.util.HashMap;

public class MapConcept {

	public static void main(String[] args) {
		
		//collection: <key,value> pair
		//HaspMap(c) --> Map (I)
		//its non order based collection -- no order
		//one null key is allowed
		//but multiple values can be allowed
		
		HashMap<String, Integer> map = new HashMap<String , Integer>();
		map.put("chrome", 101);
		map.put("ie", 31);
		map.put("firefox", 40);
		map.put("edge", 10);
		
		System.out.println(map);
		
		HashMap<Integer, Integer> map1 = new HashMap<Integer , Integer>();
		map1.put(100, 1);
		
		HashMap<String, Object> data = new HashMap<String , Object>();
		data.put("name", "mala");
		data.put("age", "34");
		data.put("designation", "SDET");
		data.put("isperm", true);
		data.put(null, 'f');
		data.put(null, "India");
		data.put("city", null);
		data.put("address", null);
		data.put(null, null);
	
		
		
		System.out.println(data);
		System.out.println(data.get("name"));
		System.out.println(data.get("age"));
		System.out.println(data.get("isperm"));
		//System.out.println(data.get(null));
		System.out.println(data.get("city"));
		System.out.println(data.get("address"));

		System.out.println("--------------");
		
		HashMap<String, Integer> empMap = new HashMap<String , Integer>();
		empMap.put("Tom", 40);
		empMap.put("Malar", 20);
		empMap.put("Thangam", 54);
		empMap.put("Appachi", 69);
		empMap.put("Mukil", 5);
		empMap.put("Navir", 2);
		empMap.put("Sam", 29);
		System.out.println(empMap);
	}

}
