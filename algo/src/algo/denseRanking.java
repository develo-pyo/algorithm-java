package algo;

public class denseRanking {
	public static void main(String[] args) {
		
//		int[] scores = {30, 50, 50, 50, 70, 90, 100};
//		int[] ranks=new int[scores.length];
//		ranks[0]=1;
//	    for(int i=1;i<ranks.length;i++) {
//	    	ranks[i]=(scores[i]==scores[i-1])?ranks[i-1]:ranks[i-1]+1;
//	        //System.out.println("Inside the loop : ["+i+"] "+scores[i]+" "+currentRanks[i]);
//	    }
//	    
//	    for(int i : ranks) {
//	    	System.out.print(i + " ");
//	    }
	    
		
		// length 8
		// i 6±îÁö
		
	    int[] scores = {30, 50, 50, 50, 70, 90, 90, 100};
		int[] mine = {30, 50, 80, 90};	//5 4 3 2
		
		int[] ranks = new int[mine.length];
		
		int cnt = 0;
		
		for (int a = 0; a < mine.length; a++) {
			int rk = 1;
			//int idx = 0;
			
				//System.out.print(cnt++ +" ");
				
				for(int j=a+1; j<scores.length; j++) {
					if(scores[j-1] != scores[j]) {								
						rk++;
						System.out.println(">> " + scores[j-1] + " >> " + (j-1) +" : " + rk);
					} else {
						System.out.println(">>>> " + scores[j-1] + " >> " + (j-1) + " : " + rk);
					}
				}
				
			
			
			ranks[a] = rk;
		}
		System.out.println();
		for(int rank : ranks) {
			System.out.print(rank + " ");
		}

	}
}
