package algo_programmers.before2207;

public class SkillTest2_1 {

	public static void main(String[] args) {
		int[] prices = {1, 3, 2, 3, 2};
		int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length-1; i++){
            int sec=0;
            for(int j=i+1; j<prices.length; j++){
                sec++;
                if(prices[i] > prices[j]){
                    break;
                } 
            }
            answer[i] = sec;
        }
        for(int i:answer){
            System.out.print(i+" ");
        }
//        return answer;
	}

}
