package algo_programmers.before2207;

import java.util.Arrays;

public class SkillTest2_2 {
//	주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		int result = 0;
		long[] arr = {1,2,3,4};
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					long num = arr[i] + arr[j] + arr[k];
					if(check(num)) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	static boolean check(long input) {
		boolean rs = true;
		long length = input;
		for(long i=2; i<length; i++) {
			if(input%i==0) {
				return false;
			}
		}
		return rs;
	}
}
