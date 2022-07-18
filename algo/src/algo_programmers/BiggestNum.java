package algo_programmers;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNum {
	
	//프로그래머스, 정렬, 가장 큰 수
	public static void main(String[] args) {
		int[] numbers = {91, 9, 92};	
		String answer = new String();
		
		String str_numbers[] = new String[numbers.length];
		
		
		for(int i=0; i<str_numbers.length; i++) {
			str_numbers[i] = String.valueOf(numbers[i]);
		}
		
		
		Arrays.sort(str_numbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});
		
		
		for(String s : str_numbers) {
			System.out.print(s + " ");
		}
		
		if(str_numbers[0].startsWith("0")) {
			answer = "0";
		} else {
			for(int j=0; j<str_numbers.length; j++) {
				answer += str_numbers[j];
			}
		}
		System.out.println();
		System.out.println(answer);
		
//		return answer;
	}
	
	
}
