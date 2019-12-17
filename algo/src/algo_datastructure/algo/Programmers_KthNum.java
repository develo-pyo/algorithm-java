package algo_datastructure.algo;

import java.util.Arrays;

public class Programmers_KthNum {
	//프로그래머스 코딩테스트 연습 > 정렬 > K번째 수
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		for(int i : solu2(arr, commands)) {
			System.out.print(i+" ");
		}
	
	}
	
	//내 코드
	private static int[] solu(int[] arr, int[][] commands) {
		
		int i = -1;
		int j = -1;
		int k = -1;
		
		int[] result = new int[commands.length];
		
		for(int c=0; c<commands.length; c++) {
			i = commands[c][0];
			j = commands[c][1];
			k = commands[c][2];
			
			int[] a = new int[j-i+1];
			
			int idx = 0;
			for(int ii=i-1; ii<j; ii++) {
				a[idx] = arr[ii];
				idx++;
			}
			
			Arrays.sort(a);
			
			result[c] = a[k-1];
		}
		return result;
	}
	
	//다른사람의 코드(Arrays.copyOfRange 사용)
	private static int[] solu2(int[] arr, int[][] commands) {
		int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(arr, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
	}
	
}
