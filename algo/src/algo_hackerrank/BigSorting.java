package algo_hackerrank;

import java.math.BigInteger;
import java.util.Arrays;

public class BigSorting {
	
	public static void main(String[] args) {
		String[] arr = {"1", "5", "6", "2"};
		String[] rs = bigSorting(arr);
		for(String s : rs) {
			System.out.println(s);
		}
	}
	
	static String[] bigSorting(String[] unsorted) {
		
		BigInteger[] barr = new BigInteger[unsorted.length];
		
		for(int i=0; i<unsorted.length; i++) {
			barr[i] = new BigInteger(unsorted[i]);
		}
		
		Arrays.sort(barr);
		
		for(int i=0; i<barr.length; i++) {
			unsorted[i] = String.valueOf(barr[i]);
		}
		
		return unsorted;
	}
}
