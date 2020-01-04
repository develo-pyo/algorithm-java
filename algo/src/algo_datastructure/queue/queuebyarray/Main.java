package algo_datastructure.queue.queuebyarray;

public class Main {
	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}
	}
}
