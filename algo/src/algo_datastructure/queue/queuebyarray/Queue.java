package algo_datastructure.queue.queuebyarray;

class Queue {
	
	private int[] array = new int[100];
	int lastIdx = 0;
	
	public void add(int input) {
		array[lastIdx] = input;
		lastIdx++;
	}
	
	public int peek() {
		return array[0];
	}
	
	public int poll() {
		int rs = array[0];
		
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
