package algo_datastructure.stack.queuebystack;

public class Main {

	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println("peek : "+q.peek());
		System.out.println("poll : "+q.poll());
		
		q.add(4);
		System.out.println("peek : "+q.peek());
		while(!q.isEmpty()) {
			System.out.println("poll : "+q.poll());
		}
		
	}
	
}
