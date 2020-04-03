package algo_codility;

import java.util.Arrays;

public class L4_PermCheck {
   
   //https://app.codility.com/c/run/trainingYGNQRM-TQP/
   public static void main(String[] args) {
      int[] arr = {1, 1};
//      System.out.println(solution(arr));
      System.out.println(solution(arr));
   }
   
   //O(N) ~ O(N*log(N)) : mine
   private static int solution(int[] A) {
      Arrays.sort(A);
      
      if(A[0]!=1) return 0;
      
      for(int i=0; i<A.length-1; i++) {
         if(A[i+1] - A[i] > 1 || A[i+1] == A[i] ) {
            return 0;
         }
      }
      
      return 1;
   }
   
   //O(N) : someone else
   private static int solu(int[] A) {
   // write your code in Java SE 8
      boolean[] seen = new boolean[A.length + 1];
      // repeated elements
      for (int i = 0; i < A.length; i++) {
         if(A[i] < 1 || A[i] > A.length) return 0;
         if(seen[A[i]] == true) return 0;
         else seen[A[i]] = true;
      }
      
      return 1;
   }
}
