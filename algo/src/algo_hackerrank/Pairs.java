package algo_hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pairs {

//	public static void main(String[] args) {
//		
//		//입력 배열값
//		Integer[] arr = {1, 5, 3, 4, 2};
//		//원하는 차액
//		int gap = 2;
//		
//		//내림차순 정렬
//		Arrays.sort(arr, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//		});
//		
//		int result = 0;
//		
//		// 5 4 3 2 1
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] - arr[j]==gap) {
//					result++;
//					break;
//				}
//			}
//		}
//		
//		System.out.println("result : "+result);
//		
//	}
	
	
	public static void main(String[] args) {
		
		//입력 배열값
		Integer[] arr = {1, 5, 3, 4, 2};
		
		//원하는 차액
		int gap = 2;
			
		HashSet<Integer> set = new HashSet<>();
		
		
		for(int i : arr) {
			set.add(i);
		}
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			if(set.contains(arr[i]-gap))result++;
		}
				
		System.out.println("result : "+result);
		
	}
}
