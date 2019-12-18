package algo_hackerrank;

import java.math.BigInteger;

public class SeparateTheNumbers {
	
	//hackerrank separate the numbers, easy
	//https://www.hackerrank.com/challenges/separate-the-numbers/problem
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solu("9999999999991000000000000");
//		solu("910112");
	}
	
	private static void solu(String input) {
		
		if(input.length()<2) {
			//예외처리
			System.out.println("NO");
			return;
		} else {
			for(int i=1; i<input.length(); i++) {
				String str = input;
				String start = String.valueOf(input.substring(0, i));
				String initStart = String.valueOf(input.substring(0, i));
				while(true) {
//					System.out.println("start : " + start);
//					System.out.println("str : " + str);
//					System.out.println("startwith : " + str.startsWith(start));
//					System.out.println();
					if(str.startsWith(start)) {
						str = str.substring(start.length());    
						if(str.isEmpty()) {
							System.out.println("YES " + initStart);
							return;
						}
						start = String.valueOf(new BigInteger(start).add(new BigInteger("1")));
					} else {
						break;
					}
				}
			}
			System.out.println("NO");
		}
	}

}
