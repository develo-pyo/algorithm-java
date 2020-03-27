package algo_hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Strange_Counter {

	public static void main(String[] args) {

		//a : 초기 배열
        //k : 이동 횟수
        //q : 출력할 최종 배열의 인덱스
		int[] a = {1, 2, 3};
		int k = 2;
		int[] q = {0, 1, 2};
		
		//결과
		int[] result = new int[q.length];
		

		//분석
        //         1 2 3 4
		//		 4 1 2 3
		//	   3 4 1 2         
		//	 2 3 4 1		 
		// 1 2 3 4
		
		int tmp = 0;
		if(a.length != k) {
			if(a.length > k) {
				tmp = k;
			} else {
				tmp = k % a.length;
			}
		}
		
		List<Integer> tt = new ArrayList<Integer>();
		
		for(int i=a.length-tmp; i<a.length; i++) {
			tt.add(a[i]);
		}
		for(int i=0; i<a.length-tmp; i++) {
			tt.add(a[i]);
		}
        
        System.out.println("result list : " + tt);
        
        for(int i=0; i<q.length; i++) {
        	result[i] = tt.get(q[i]);
        }
        
        for(int i : result) {
        	System.out.println("result : " + i);
        }
        
	}
	
	
	
}
