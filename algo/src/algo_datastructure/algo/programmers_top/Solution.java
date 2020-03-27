package algo_datastructure.algo.programmers_top;

import java.util.Stack;

public class Solution {
	
	public int[] solution(int[] tower) {
		int[] result = new int[tower.length];
		
		Stack<Integer> stack = new Stack<>();
		for(int i : tower) {
			stack.push(i);
		}
		print(stack);
		
		System.out.println();
		
		//a 6 9 5 7 4
		//s 6 9 5 7 4
		for(int i=0; i<tower.length; i++) {
			int r = tower[tower.length-1-i];
			int idx = 0;
			
			while(!stack.isEmpty()) {
				
				int l = stack.pop();
				System.out.println("l : " + l + " r " + r);
				if(l > r) {
					System.out.println("result["+(tower.length-1-i)+"]=" +(tower.length-idx)+";");
					result[tower.length-1-i] = tower.length-idx;
					break;
				}
				idx++;
			}
			
		}
		
		
		return result;
	}
	
	private void print(Stack<Integer> s) {
		for(int i : s) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
}
