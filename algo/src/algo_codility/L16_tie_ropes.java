package algo_codility;

public class L16_tie_ropes {
   
   public static void main(String[] args) {
      int K = 4;
      int[] A = {1,2,3,4,1,1,3};
      System.out.println(solution(K,A));
   }
   
   //O(N) 100%
   private static int solution(int K, int[] A) {
      int rs = 0;
      
      int sum=0;
      for(int a : A) {
         sum+=a;
         if(sum >= K) {
            sum = 0;
            rs++;
         }
      }
      
      return rs;
   }
   
}
