package algo_hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class PriyankaAndToys {
	//hackerrank easy, Priyanka And Toys
	public static void main(String[] args) {
		
		Integer[] arr = {233,960,27,817,961,919,450,19,882,278,217,304,742,920,605,92,376,64,837,31,893,273,689,188,18,334,952,807,847,296,630,80,256,657,249,570,928,699,589,811,977,806,467,71,78,72,515,806,137,352,837,382,626,879,571,996,565,875,803,412,523,785,844,780,443,93,350,723,792,291,534,121,97,353,544,527,426,412,333,915,764,523,649,742,402,572,90,319,447,246,731,323,31,927,103,826,20,805,550,164};
//		Integer[] arr = {1,2,3,4,5,9,10,11,12,13,14,15};
		// 
		int rs = toys(arr);
		System.out.println("result : " + rs);
	}
	
	private static int toys(Integer[] w) {
		int result = 0;
		
		Arrays.sort(w, (x, y)->y-x);
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i : w) {
			stack.add(i);
		}
		
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			result++;
			
			boolean flag = true;
			while(flag && !stack.isEmpty()) {
				System.out.println(stack.peek()+" / " + (tmp+4));
				if(stack.peek() <= tmp+4) {
					stack.pop();
				} else {
					flag = false;
				}
			}
		}
		
		return result;
	}
}
