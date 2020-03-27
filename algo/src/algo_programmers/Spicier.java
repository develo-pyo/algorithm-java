package algo_programmers;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//programmers, 힙, 더 맵게
//남의 풀이 : priorityqueue 를 사용. 
//priorityqueue는 데이터 넣을 때(add/offer)마다 정렬된 상태로 데이터가 축적되므로 이를 이용하여 쉽게 구현가능
public class Spicier {

	public static void main(String[] args) {
		int[] schoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println("result : " + solution(schoville, K));
		
	}

	static int solution(int[] scoville, int K) {
		int rs = 0;
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i:scoville) {
			queue.offer(i);
		}
		
		while(queue.peek() < K) {
			if(queue.size() == 1) {
				return -1;
			}
			int newSco = queue.poll() + queue.poll()*2;
			queue.offer(newSco);
			rs++;
		}
		
		return rs;
    }
}

////나의 풀이 : 효율성에서 실패
//public class Spicier {
//
//	public static void main(String[] args) {
//		
//		int[] schoville = {6};
//		int K = 7;
//		
//		System.out.println("result : " + solution(schoville, K));
//		
//	}
//
//	static int solution(int[] scoville, int K) {
//        int answer = 0;
//        
//        List<Integer> list = new ArrayList<>();
//        for(int i : scoville) {
//        	list.add(i);
//        }
//        order(list);
//        
//        while(list.size() > 0) {
//        	if(check(list, K)) {
//        		return answer;
//        	}
//        	if(list.size() == 1) {
//        		return -1;
//        	}
//        	int newSco = list.get(0) + (list.get(1)*2);
//        	list.remove(0);
//        	list.remove(0);
//        	list.add(newSco);
//        	order(list);
////        	print(list);
//        	answer ++;
//        }
//        return -1;
//    }
//	
//	static void print(List<Integer> list) {
//		for(int i:list) {
//			System.out.print(i+" ");
//		}
//	}
//	
//	static List<Integer> order(List<Integer> input){
//		Collections.sort(input);
//		return input;
//	}
//	
//	static boolean check(List<Integer> list, int K) {
//		boolean rs = true;
//
//		for(int i : list) {
//			if(i < K) {
//				return false;
//			}
//		}
//		
//		return rs;
//	}
//}

