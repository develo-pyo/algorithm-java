package algo_datastructure.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		
		//입력한 순서가 보장됨
		//Thread safe X
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		map.put(1, 180);
		map.put(3, 175);
		map.put(2, 160);
		map.put(4, 190);
		map.put(3, 170);
		
		for(int s : map.keySet()) {
			System.out.println("person : " + s + ", height : " + map.get(s));
		}
		
	}

}