package algo_hackerrank;

public class StandardCompetitionRanking {
	public static void main(String[] args) {
		
		//기준 점수가 있고, 내 점수가 있을 때 내 점수 순위 매기기
//		int[] scores = {30, 50, 50, 50, 70, 90, 90, 100};
//		int[] mine = {50, 80, 90};
//		
//		int[] ranks = new int[mine.length];
//		
//		for (int a = 0; a < mine.length; a++) {
//			int tmp = 1;
//			for (int i = 0; i < scores.length; i++) {
//				if (mine[a] < scores[i]) {
//					tmp++;
//				}
//			}
//			ranks[a] = tmp;
//		}
//		for(int rank : ranks) {
//			System.out.print(rank + " ");
//		}

		
		//배열 하나에 점수들이 있을 때 점수들 순위 매기기
		int[] scores = {80, 90, 90, 100}; 
		int[] ranks = new int[scores.length];
		ranks[0] = 1;
		for (int i = 1; i < ranks.length; i++) {
			ranks[i] = scores[i] == scores[i - 1] ? ranks[i - 1] : i + 1;
		}
		for(int rank : ranks) {
			System.out.print(rank + " ");
		}
		
		
	}
}
