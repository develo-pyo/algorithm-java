package algo_datastructure.algo.programmers_hash1;

import java.util.Arrays;
import java.util.Stack;

public class Main {
	//프로그래머스 > 해시 > 완주하지 못한 선수 
	public static void main(String[] args) {
		String[] part = {"a", "b", "b", "c"};
		String[] comp = {"a", "b", "b"};
		System.out.println(solu(part, comp));
	}
	
	//나의 풀이
	private static String solu(String[] part, String[] comp) {
		String result = "";
		Arrays.sort(part);
		Arrays.sort(comp);
		print(comp);
		print(comp);
		
		for(int i=0; i<comp.length; i++) {
			if(!part[i].equalsIgnoreCase(comp[i])){
				result = part[i];
			}
		}
		
		if(result.isEmpty())result=part[part.length-1];
		return result;
	}
	
	//고수의 풀이
	private static String solu2(String[] part, String[] comp) {
		Arrays.sort(part);
		Arrays.sort(comp);
		print(comp);
		print(comp);
		
		int i=0;	//for 문의 index 를 밖으로 빼서 사용..
		for(i=0; i<comp.length; i++) {
			if(!part[i].equalsIgnoreCase(comp[i])){
				return part[i];
			}
		}
		return part[i];
	}
	
	private static void print(String[] input) {
		for(String i : input) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
}
