package algo_datastructure.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {

	public static void main(String[] args) {
		
		//순서를 보장하지 않음
		//key, value 에 Null 허용
		//Thread safe
		
		Map<Integer, Integer> map = new Hashtable<>();
		
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
	}

}
