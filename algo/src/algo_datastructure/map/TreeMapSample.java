package algo_datastructure.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		
		//KEY를 기준으로 정렬함(내부적으로 RedBlackTree 구조로 정렬)
		//Thread safe X
		
//		Map<Integer, Integer> map = new TreeMap<>();
//		
//		map.put(1, 180);
//		map.put(3, 175);
//		map.put(2, 160);
//		map.put(4, 190);
//		map.put(3, 170);
//		
//		for(int s : map.keySet()) {
//			System.out.println("person : " + s + ", height : " + map.get(s));
//		}
		
		Map<Integer, Integer> map2 = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		}); 
		
		map2.put(1, 180);
		map2.put(3, 175);
		map2.put(2, 160);
		map2.put(4, 190);
		map2.put(3, 170);
		
		for(int s : map2.keySet()) {
			System.out.println("person : " + s + ", height : " + map2.get(s));
		}
		
	}

}