package algo_hackerrank;

import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {

	public static void main(String[] args) {
		
		// a b a b a È¦Â¦ O
		// b a a b   Â¦Â¦ O
		// a b a b a b È¦È¦ X
		// È¦ 2°³ ÀÌ»óÀÎ °æ¿ì ¾ÈµÊ
		
		System.out.println(solu("aaabbbb"));
	}
	
	private static String solu(String input) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		for(int i=0; i<input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);
		}
		int tmp = 0;
		for(Character c : map.keySet()) {
			if(map.get(c)%2!=0) {
				tmp++;
				if(tmp > 1) {
					return "NO";
				}
			}
		}
		
		return "YES";
	}
}
