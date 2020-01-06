package algo_datastructure.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BasicUsageOfQueue {

	public static void main(String[] args) {
		System.out.println("Queue---------");
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}
		
		System.out.println("\nPriorityQueue (default : ascending)---------");
		Queue<Integer> q2 = new PriorityQueue<Integer>();
		q2.add(1);
		q2.add(3);
		q2.add(2);
		System.out.println(q2.peek());
		while(!q2.isEmpty()) {
			System.out.print(q2.poll() + " ");
		}
		
		System.out.println("\nPriorityQueue (Descending)---------");
		Queue<Integer> q3 = new PriorityQueue<Integer>((o1, o2)->o2-o1);
		q3.add(1);
		q3.add(3);
		q3.add(2);
		System.out.println(q3.peek());
		while(!q3.isEmpty()) {
			System.out.print(q3.poll() + " ");
		}
	}

}
