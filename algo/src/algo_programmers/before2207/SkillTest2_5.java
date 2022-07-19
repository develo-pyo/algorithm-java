package algo_programmers.before2207;

import java.util.Arrays;

public class SkillTest2_5 {

//	어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
//	예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
	
	public static void main(String[] args) {
		
//		String result = "";
		StringBuffer result = new StringBuffer();
		
		String number = "1852474";
		int k = 4;
		
		int[] numArr = new int[number.length()];
		
		for(int i=0; i<number.length(); i++) {
			numArr[i] = Integer.parseInt(Character.toString(number.charAt(i)));
		}
		
		// number.length - k = 3
		// 0~number.length-3 : 18524   8 8 다음 수 5의 인덱스는 2
		// 2~number.length-2 : 5247	   7 7 다음 수 4의 인덱스는 6
		// 6~number.length-1 : 4       4
		
		//i 0 1 2
		//j 3 2 1
		int startIdx = 0;
		for(int i=0; i<numArr.length-k; i++) {
			int biggestNum = 0;
			System.out.println(startIdx +", "+ (numArr.length - (numArr.length-k-i)));
			for(int j=startIdx; j<=k+i; j++) {
				if(numArr[j] > biggestNum) {
					biggestNum = numArr[j];
					startIdx = j+1;
				}
			}
			result.append(biggestNum);
		}
		
		System.out.println(result);
		
	}

}
