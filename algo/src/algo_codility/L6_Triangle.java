package algo_codility;

import java.util.Arrays;

public class L6_Triangle {

   public static void main(String[] args) {
      int arr[] = {1, 2, 5, 2147483645, 2147483646, 2147483647};
      //                                2147483647
      System.out.println(solution(arr));
      
   }
   
   //NlogN
   private static int solution(int[] A) {
      Arrays.sort(A);
      
      for(int i=0; i<A.length-2; i++) {
         long a = A[i];
         long b = A[i+1];
         long c = A[i+2];
         if(a+b > c && c+b > a && a+c > b) {
            return 1;
         }
      }
      
      return 0;
   }
   
}
