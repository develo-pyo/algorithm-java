package algo_hackerrank;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {

	//hackerrank easy
	public static void main(String[] args) {
		
		int result = stringConstruction("bccb");
		System.out.println(result);
		
	}
	
	static int stringConstruction(String s) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<s.length(); i++) {
			set.add((int)s.charAt(i));
		}
		
		return set.size();
	}

}
