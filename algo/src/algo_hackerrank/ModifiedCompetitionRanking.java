package algo_hackerrank;

public class ModifiedCompetitionRanking {
	public static void main(String[] args) {
		
		int[] scores = {80, 90, 90, 100};        
		
		//동점자가 있다면 순위+1 을 시키는 방식으로 순위 매기기 (ex:1334)
        int[] ranks = new int[scores.length];
        ranks[scores.length - 1] = scores.length;
        for (int i = ranks.length - 2; i >= 0; i--){
            ranks[i] = scores[i] == scores[i + 1] ? ranks[i + 1] : i + 1;
        }   
 
        for(int rank : ranks) {
            System.out.print(rank + " ");
        }        
	}
}
