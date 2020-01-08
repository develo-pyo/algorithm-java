package algo_hackerrank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GemStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"abcd", "abc", "bc"};
		int rs = gemstones(arr);
		System.out.println("result : "+rs);
	}

	private static int gemstones(String[] arr) {
		int result = 0;
		
		String standard = arr[0];
		Set<Character> s = new HashSet<>();
		for(int i=0; i<standard.length(); i++) {
			s.add(standard.charAt(i));
		}
		standard = "";
		
		Iterator<Character> iter = s.iterator();
		
		while(iter.hasNext()) {
			standard += iter.next();
		}
		
		if(arr.length == 0) {
			return standard.length();
		}
		
		for(int j=0; j<standard.length(); j++) {
			boolean isSame = false;
			for(int i=1; i<arr.length; i++) {
				String target = arr[i];
				int originLength = target.length();
				int afterLength = target.replaceAll(String.valueOf(standard.charAt(j)), "").length();
//				System.out.println("target : " + target + "/ after : " + target.replaceAll(String.valueOf(standard.charAt(j)), ""));
				if(originLength == afterLength) {
					isSame = true;
					break;
				}
			}
			if(!isSame) {
				result++;
			}
		}
		
		return result;
	}
}
