package algo_codility;

public class L10_CountFactors {

   public static void main(String[] args) {
      
      System.out.println(solution(24));
      
   }
   
   //O(N) 71%
   private static int solution(int N) {
      int rs = 1;
      
      for(int i=2; i<=N; i++) {
        if(N%i==0)rs++;
      }
      
      return rs;
   }
   
}
