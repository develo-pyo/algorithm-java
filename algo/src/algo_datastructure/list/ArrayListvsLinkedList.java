package algo_datastructure.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListvsLinkedList {

	private static long START_TIME = 0;
	private static long END_TIME = 0;
	
	public static void main(String[] args) {
		
		//add remove 성능은 linkedList 가 더 좋음
		//get 성능은 arrayList 가 더 좋음
		List<Integer> ArrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		setStartTime();
		for(int i=0; i<10000; i++) {
			ArrayList.add(0);
		}
		setEndTime();
		System.out.print("ArrayList add:");
		printDuration();

		
		setStartTime();
		for(int i=0; i<10000; i++) {
			linkedList.add(0);
		}
		setEndTime();
		System.out.print("LinkedList add:");
		printDuration();
		
		System.out.println("-------------------------------------------------");
		
		setStartTime();
		for(int i=0; i<10000; i++) {
			ArrayList.get(i);
		}
		setEndTime();
		System.out.print("ArrayList get:");
		printDuration();
		
		
		setStartTime();
		for(int i=0; i<10000; i++) {
			linkedList.get(i);
		}
		setEndTime();
		System.out.print("LinkedList get:");
		printDuration();
		
		System.out.println("-------------------------------------------------");
		
		setStartTime();
		Iterator<Integer> ai = ArrayList.iterator();
		while(ai.hasNext()) {
			ArrayList.remove(0);
		}
		setEndTime();
		System.out.print("ArrayList remove:");
		printDuration();
		
		
		setStartTime();
		Iterator<Integer> li = linkedList.iterator();
		while(li.hasNext()) {
			linkedList.remove(0);
		}
		setEndTime();
		System.out.print("LinkedList remove:");
		printDuration();
		
	}
	
	private static void setStartTime() {
		START_TIME = System.nanoTime();
	}
	
	private static void setEndTime() {
		END_TIME = System.nanoTime();
	}
	
	private static void printDuration() {
		System.out.println(END_TIME - START_TIME);
	}
}
