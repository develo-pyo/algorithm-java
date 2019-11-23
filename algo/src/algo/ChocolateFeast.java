package algo;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = solution(12, 4, 4);
		System.out.println("result : " + r);
	}
	
	public static int solution(int n, int c, int m) {
		int totChoco = 0;	//ÃÑ ÃÊÄÝ¸´ °¹¼ö
		int wrap = 0;	//²®Áú°¹¼ö
		
//		n : 6 
//		c : 2
//		m : 2
//		tc : 3
//		tw : 3
//		tw : 4
//		
		// 6 2 2
		// 3 0
		// 0 3 
		// 1 1
		// 0 2
		// 1 0
		// 0 1
		
		totChoco += n/c;	
		wrap = totChoco;	//3
		int freeChoco = 0;
		while(wrap >= m) { //²®ÁúÀÇ°¹¼ö°¡ ±³È¯ÀÌ °¡´ÉÇÑ ¼öÀÏ ¶§ ±îÁö
			totChoco += (int)(wrap/m);	//totChoco >> 4 wrap/m >> 1
			wrap = (int)(wrap/m) + wrap%m;
			System.out.println(wrap);
		}
		
		return totChoco;
	}
}
