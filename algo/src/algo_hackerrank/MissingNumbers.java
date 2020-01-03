package algo_hackerrank;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class MissingNumbers {
	
	//hackerrank easy MissingNumbers 83%
	public static void main(String[] args) {
//		a 1 1 1 3
//		b 1 1 3 3 3
		int[] arr = {4, 4, 7, 10, 11, 11, 11, 12, 13, 14 };
		int[] brr = {3, 4, 4, 7, 7, 8, 10, 10, 11, 11, 11, 12, 12, 13, 14};
		Integer[] result = solu(arr, brr);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}

	static Integer[] solu(int[] arr, int[] brr) {
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		Stack<Integer> aStack = new Stack<>();
		Stack<Integer> bStack = new Stack<>();
		for(int i:arr) {
			aStack.add(i);
		}
		for(int i:brr) {
			bStack.add(i);
		}
		
		Integer[] result = new Integer[brr.length - arr.length];
		int idx = 0;
		while(!aStack.isEmpty()) {
//			int aTop = aStack.peek();
//			int bTop = bStack.peek();
//			System.out.println("atop : " + aStack.peek() + ", btop : " +bStack.peek());
			if(aStack.peek().equals(bStack.peek())) {
				aStack.pop();
				bStack.pop();
			} else {
				int tmp = bStack.pop();
//				System.out.println(tmp);
				result[idx] = tmp;
				idx++;
			}
		}
		while(!bStack.isEmpty()) {
			int tmp = bStack.pop();
			result[idx] = tmp;
			//result[idx] = bStack.pop();
			idx++;
		}
			
//		System.out.println(Arrays.toString(result));
		Arrays.sort(result,	(o1, o2)->o1-o2);
		Set<Integer> uniqueRs = new LinkedHashSet<>();
		for(int i:result) {
			uniqueRs.add(i);
		}
		Iterator<Integer> iteratorOfUnique = uniqueRs.iterator();
		int idx2 = 0;
		Integer[] rs = new Integer[uniqueRs.size()];
		while(iteratorOfUnique.hasNext()) {
			int tk = iteratorOfUnique.next();
			rs[idx2] = tk;
			idx2++;
		}
		return rs;
	}
	
	
}
