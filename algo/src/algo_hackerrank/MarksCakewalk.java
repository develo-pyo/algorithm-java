package algo_hackerrank;

import java.util.Arrays;

public class MarksCakewalk {
	
	//hackerrank easy : Mark's Cakewalk
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {7, 4, 9, 6};
		long rs = marcsCakewalk(arr);
		System.out.println("result:"+rs);
	}
	
	static long marcsCakewalk(Integer[] calorie) {
		long rs = 0;
		
		Arrays.sort(calorie, (x,y)->y-x);
		for(int i=0; i<calorie.length; i++){
			rs += Math.pow(2, i) * calorie[i];
		}
		
		return rs;
    }
}
