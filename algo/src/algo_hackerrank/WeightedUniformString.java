package algo_hackerrank;

import java.util.HashSet;
import java.util.Set;

public class WeightedUniformString {
	
	//hackerrank Weighted Uniform String easy
	//timeout.. fail
	public static void main(String[] args) {
		
		int[] arr = {9,7,8,12,5};
		
		String[] rs = solu("aaabbbbcccddd", arr);
		for(String r : rs) {
			System.out.println(r);
		}
	}
	
	public static String[] solu(String s, int[] queries) {
		String[] result = new String[queries.length];
		
		int mn = 96;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<s.length(); i++) { 
			int sum = 0;
			int idx = 0;
			
			while(i+idx < s.length() && s.charAt(i) == s.charAt(i+idx)) {
				sum = sum + s.charAt(i+idx)-mn;
				set.add(sum);
				idx++;
			}
			
		}
		
		for(int i=0; i<queries.length; i++) {
			if(set.contains(queries[i])) {
				result[i] = "Yes";
			} else {
				result[i] = "No";
			}
		}
//		for(int i : set) {
//			System.out.print(i+" ");
//		}
		return result;
	}
	
}
