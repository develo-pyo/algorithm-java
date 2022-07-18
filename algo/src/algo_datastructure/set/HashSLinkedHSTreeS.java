package algo_datastructure.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSLinkedHSTreeS {
	
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(null);
		set.add(null); //중복허용X (null도 한개만 허용)
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(1);	//중복허용X
		
		System.out.print("HashSet: ");
		
		Iterator<Integer> si = set.iterator();
		while(si.hasNext()) {
			System.out.print(si.next()+" ");
		}
		System.out.println();
		
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		linkedHashSet.add(3);
		linkedHashSet.add(2);
		linkedHashSet.add(1);
		linkedHashSet.add(1); //중복허용 X
		
		System.out.print("linkedHashSet: ");
		Iterator<Integer> li = set.iterator();
		while(si.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		

		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(1); //중복허용X
		
		System.out.print("TreeSet: ");
		for(int i : treeSet) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		Set<Integer> treeSetDescending = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				//내림차순
				return o2-o1;
			}
		});
		
		System.out.print("TreeSetDescending: ");
		try {
			treeSetDescending.add(null);	//null 허용 X
		}catch(NullPointerException ne) {
			System.out.println("exception:"+ne.getMessage());
		}
		treeSetDescending.add(3);
		treeSetDescending.add(2);
		treeSetDescending.add(1);
		treeSetDescending.add(1); //중복허용X
		
		for(int i : treeSetDescending) {
			System.out.print(i+" ");
		}
	}
}
