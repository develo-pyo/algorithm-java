package algo_hackerrank;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
	
	//Hackerrank TwoStrings easy
	public static void main(String[] args) {
		String result = twoStrings("hello", "world");
		System.out.println(result);
	}
	
	private static String twoStrings(String s1, String s2) {
		String result = "NO";
		
		Set<Character> set1 = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++) {
			set1.add(s1.charAt(i));
		}
		
		Set<Character> set2 = new HashSet<Character>();
		for(int i=0; i<s2.length(); i++) {
			set2.add(s2.charAt(i));
		}
		
		for(Character c1 : set1) {
			for(Character c2 : set2) {
				if(c1 == c2) {
					return "YES";
				}
			}
		}
		
		return result;
	}
	
}
