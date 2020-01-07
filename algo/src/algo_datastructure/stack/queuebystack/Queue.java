package algo_datastructure.stack.queuebystack;

import java.util.Stack;

class Queue <T> {
	
	private Stack<T> inStack;
	private Stack<T> outStack;
	
	public Queue(){
		inStack = new Stack<T>();
	}
	
	public boolean add(T input) {
		return inStack.add(input);
	}
	
	public T poll() {
		if(!inStack.isEmpty()) {
			outStack = new Stack<T>();
		}
		while(!inStack.isEmpty()) {
			outStack.add(inStack.pop());
		}
		T topItem = outStack.pop();
		while(!outStack.isEmpty()) {
			inStack.add(outStack.pop());
		}
        return topItem;
	}
	
	public T peek() {
		if(!inStack.isEmpty()) {
			outStack = new Stack<T>();
		}
		while(!inStack.isEmpty()) {
			outStack.add(inStack.pop());
		}
		T topItem = outStack.peek();
		while(!outStack.isEmpty()) {
			inStack.add(outStack.pop());
		}
        return topItem;
	}
	
	public boolean isEmpty() {
		return inStack.isEmpty();
	}
	
}
