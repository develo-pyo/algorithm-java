package algo_hackerrank;

import java.util.Arrays;

//hackerrank FindTheMedian easy
public class FindTheMedian {
	public static void main(String[] args) {
		int[] arr = {1, 5, 4, 2, 3};
		System.out.println(findMedian(arr));
	}
	
	static int findMedian(int[] arr) {
		int result = 0;
		
		Arrays.sort(arr);
		
		result = arr[arr.length/2];
		
		return result;
	}
}
