package algo_datastructure.tree;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 8, 12, 18, 20, 23, 26, 30};
		
		Arrays.sort(arr);	//올림차순 정렬
		  
		
		System.out.println(binarySearch_recursion(arr, 0, arr.length-1, 4));
		
		System.out.println(binarySearch_loop(arr, 0, arr.length-1, 23));
	}
	
	public static int binarySearch_recursion(int[] arr, int start, int last, int no) {
		int mid = (int)(start+last)/2;	//중간 값(나머지는 버린다)
		
		if(arr[mid] == no) {
			return mid;
		} else if(arr[mid] > no){
			//중간 값이 찾고자 하는 값보다 큰 경우
			last = mid - 1;
			return binarySearch_recursion(arr, start, last, no);
		} else {
			//중간 값이 찾고자 하는 값보다 작은 경우
			start = mid + 1;
			return binarySearch_recursion(arr, start, last, no);
		}
	}
	
	
	public static int binarySearch_loop(int[] arr, int start, int last, int no) {
		
		while(true) {
			int mid = (int)(start + last)/2;	//중간 값(나머지는 버린다)
			if(arr[mid] == no) {
				return mid;
			} else if(arr[mid] > no) {
				//중간 값이 찾고자 하는 값보다 큰 경우
				last = mid - 1;
			} else {
				//중간 값이 찾고자 하는 값보다 작은 경우
				start = mid + 1;
			}
		}
		
	}
	
	
}
