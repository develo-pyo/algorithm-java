package algo;

import java.util.HashMap;
import java.util.Map;

public class CircularArrayRotation {

	public static void main(String[] args) {

//		1 + 3*0 = 1
//		1 + 3*1 = 4
//		1 + 3*2 + 3*1 = 10
//		1 + 3*2*2 + 3*2 + 3*1 = 22  
//		1 + 3*2*2*2 + 3*2*2 + 3*2 + 3*1 =
		
		long input = 12;
		
		long i = 0;
		do {
			i++;
		} while(input>=findInit(i));
		
		long timeInit = findInit(i-1);
		long valueInit = findInit(i) - findInit(i-1);
		
		System.out.println(timeInit);
		System.out.println(valueInit);
		
		System.out.println(valueInit - (input - timeInit));
		
	}
	
	public static long findInit(long n) {
		long rs = 1;
		for(int i=0; i<n-1; i++) {
			rs += Math.pow(2, i) * 3;
		}
		return rs;
	}
	
}
