package algo_codility;

import java.util.Arrays;

public class L3_PermMissingElem {

   public static void main(String[] args) {
      int[] arr = {2, 3};
      System.out.println(solution(arr));
   }

   //O(N)~O(NlogN)
   private static int solution(int[] A) {
      int sum = 0;
      for(int i=1; i<=A.length + 1; i++) {
          sum += i;
      }
      for(int i=0; i<A.length; i++) {
          sum -= A[i];
      }
      return sum;
   }
   
}
