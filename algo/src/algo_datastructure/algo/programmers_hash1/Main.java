package algo_datastructure.algo.programmers_hash1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"kiki", "eden"};
		System.out.println(solu(part, comp));
	}
	
	private static String solu(String[] part, String[] comp) {
		String result = "";
		Arrays.sort(part);
		Arrays.sort(comp);
//		part : a b c
//		comp : a b
		
		for(String p : part) {
			boolean flag = false;
			for(String c : comp) {
				if(p.equalsIgnoreCase(c)) {
					flag = true;
				}
			}
			if(!flag) {
				result = p;
			}
		}
		
		return result;
	}
}
