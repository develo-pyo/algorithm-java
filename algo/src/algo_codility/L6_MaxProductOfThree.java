package algo_codility;

import java.util.Arrays;

public class L6_MaxProductOfThree {

   public static void main(String[] args) {
      
      int arr[] = {-3, -2, 1, 2, 5, 6};
      System.out.println(solution(arr));
      
   }
   
   
   //O(NlogN)
   private static int solution(int[] A) {
      
      Arrays.sort(A);
      
      int a = A[A.length-1] * A[A.length-2] * A[A.length-3];
      int b = A[0] * A[1] * A[A.length-1];
      
      return Math.max(a, b);
   }
   
}
