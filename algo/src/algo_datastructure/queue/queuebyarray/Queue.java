package algo_datastructure.queue.queuebyarray;

public class Queue {
	
	private int[] array = new int[100];
	private int lastIdx = 0;
	
	public void add(int input) {
		array[lastIdx] = input;
		lastIdx++;
	}
	
	public int peek() {
		return array[lastIdx];
	}
	
	public int pop() {
		int rs = array[lastIdx];
		
		for(int i=1; i<=lastIdx; i++) {
			array[i-1] = array[i];
		}
		lastIdx--;
		
		return rs;
	}
	
	public boolean isEmpty() {
		return lastIdx==0?true:false;
	}
}
