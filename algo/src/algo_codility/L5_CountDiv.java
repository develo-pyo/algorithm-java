package algo_codility;

public class L5_CountDiv {
   
   //https://app.codility.com/c/run/trainingXS9F5M-AF6/
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("result : " + solution2(6, 11, 2));
      
   }
   
   //O(B-A)
   private static int solution(int A, int B, int K) {
      int rs = 0;
      
      for(int i=A; i<=B; i++) {
         if(i%K==0)rs++;
      }
      
      return rs;
   }
   
   //O((B-A)/K) : 62%
   private static int solution2(int A, int B, int K) {
      int rs = 0;
      
      int i = 1;
      int mK = 0;
      while(mK <= B) {
         if(mK >= A) {
            rs++;
         }
         mK = K*i;
         i++;
      }
      
      return rs;
   }
   
}
