package algo_datastructure.queue.queuebyarray;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
