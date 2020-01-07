package algo_datastructure.stack.stackbyarray;

class Stack {
	private int[] array = new int[100];
	private int lastIdx = 0;
	
	public Stack () {
	}
	
	public void add(int input) {
		array[lastIdx] = input;
		lastIdx++;
	}
	
	public int pop() {
		lastIdx--;
		int top = array[lastIdx];
		array[lastIdx] = 0;
		
		return top;
	}
	
	public int peek() {
		return array[lastIdx-1];
	}
	
	public boolean isEmpty() {
		return lastIdx==0?true:false;
	}
}
