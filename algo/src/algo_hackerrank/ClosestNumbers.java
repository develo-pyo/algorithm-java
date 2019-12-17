package algo_hackerrank;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class ClosestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 5, 3};
		int[] r = closestNumbers(arr);
		for(int i : r) {
			System.out.print(i+" ");
		}
	}
	
	private static int[] closestNumbers(int[] arr) {
		
		Arrays.sort(arr);
		
		int abs = arr[1]-arr[0];
		for(int i=2; i<arr.length; i++) {
			if(arr[i] - arr[i-1] < abs) {
				abs = arr[i] - arr[i-1];
			}
		}
		List<Integer> l = new ArrayList<>();
		for(int i=1; i<arr.length; i++) {
			if(arr[i] - arr[i-1] == abs) {
				l.add(arr[i-1]);
				l.add(arr[i]);
			}
		}
		
		int[] r = new int[l.size()];
		Iterator<Integer> it = l.iterator();
		int idx=0;
		
		while(it.hasNext()) {
			r[idx] = it.next();
			idx++;
		}

		return r;
	}
}
