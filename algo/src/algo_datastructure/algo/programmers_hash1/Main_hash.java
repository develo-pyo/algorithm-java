package algo_datastructure.algo.programmers_hash1;

import java.util.HashMap;
import java.util.Set;

public class Main_hash {
	//프로그래머스 > 해시 > 완주하지 못한 선수 
	public static void main(String[] args) {
		String[] part = {"mislov", "b", "b", "b"};
		String[] comp = {"mislov", "b", "b"};
		System.out.println(solu(part, comp));
	}
	
	
	private static String solu(String[] part, String[] comp) {
	   String answer = "";
	   
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : part) {
        	int val = hm.getOrDefault(player, 0) + 1;	//기존 value 값을 가져온 후 +1
        	hm.put(player, val);
        	System.out.print("player:"+player+" / "+val+"\n");
        }
        System.out.println("-----------------");
        for (String player : comp) {
        	int val = hm.get(player) - 1;	//기존 value 값을 가져온 후 +1
        	hm.put(player, val);
        	System.out.print("player:"+player+" / " + val + "\n");
        }
        
        System.out.println("========================");
        Set<String> a = hm.keySet();
        for(String dd : a) {
        	System.out.println(dd);
        }
        
        System.out.println("-----------------");
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
	}
	
		
	private static void print(String[] input) {
		for(String i : input) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
}
