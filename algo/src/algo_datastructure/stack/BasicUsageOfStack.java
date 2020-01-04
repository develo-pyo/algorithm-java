package algo_datastructure.stack;

import java.util.Stack;

public class BasicUsageOfStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s.peek());
		while(!s.isEmpty()) {
			System.out.println(s.pop());;
		}
		
	}
}
