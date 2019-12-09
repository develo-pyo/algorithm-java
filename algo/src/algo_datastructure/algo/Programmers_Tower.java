package algo_datastructure.algo;

public class Programmers_Tower {
	// 프로그래머스 코딩테스트연습 > 스택/큐 > 탑
	// 191203
	public static void main(String[] args) {
//		int[] tower = {6, 9, 5, 7, 4};
		int[] tower = {3, 9, 9, 3, 5, 7, 2};
		
		int[] answer = new int[tower.length];
		
		for(int i=1; i<tower.length; i++) {
			for(int j=i; j>=0; --j) {
				if(tower[j] > tower[i]) {
					answer[i] = j+1;
					break;
				}
			}
		}
		
		for(int i : answer) {
			System.out.print(i + " ");
		}
	}
	
}
