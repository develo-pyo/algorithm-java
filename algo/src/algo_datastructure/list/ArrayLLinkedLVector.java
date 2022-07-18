package algo_datastructure.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayLLinkedLVector {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(2);	//중복허용, 순서보장
		//al.remove(0);
		
		System.out.print("ArrayList: ");
		for(int i:al) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		List<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(2);	//중복허용, 순서보장
		//ll.remove(0);
		
		System.out.print("LinkedList: ");
		for(int i:ll) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		List<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(2);	//중복허용, 순서보장
		//v.remove(0);
		
		System.out.print("Vector: ");
		for(int i:v) {
			System.out.print(i+" ");
		}
		
	}

}
