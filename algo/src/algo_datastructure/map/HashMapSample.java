package algo_datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	
	public static void main(String[] args) {
		
		//순서를 보장하지 않음
		//key, value 에 Null 허용
		//Thread safe X
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 180);
		map.put(3, 175);
		map.put(2, 160);
		map.put(4, 190);
		map.put(3, 170);
		
		try {
			map.put(0, null);
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
		
		for(int s : map.keySet()) {
			System.out.println("person : " + s + ", height : " + map.get(s));
		}
		
//		map.put("person1", map.getOrDefault("person1", 150));
//		map.put("person5", map.getOrDefault("person5", 155));
//		
//		for(String s : map.keySet()) {
//			System.out.println("person : " + s + ", height : " + map.get(s));
//		}
	}
	
}