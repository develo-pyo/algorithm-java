package algo;

public class DenseRanking {
	public static void main(String[] args) {
		
		//ºóÆ´¾ø´Â »ª»ªÇÑ ¼øÀ§ ¸Å±â±â
		int[] scores = {80, 90, 90, 100};
		
		int[] ranks = new int[scores.length];
		ranks[0] = 1;
		for (int i = 1, r = 1; i < ranks.length; i++) {
			ranks[i] = scores[i] == scores[i - 1] ? r : ++r;
		}
		
		for(int rank : ranks) {
			System.out.print(rank + " ");
		}
		
		String test = "";
		System.out.println(test.toString());
	}
}
