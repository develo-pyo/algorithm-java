package algo_codility;

import java.util.Arrays;

public class L4_MissingInteger {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int arr[] = {-1, -3, 1, 2, 6};
      System.out.println(solution(arr));
   }
   
   //O(N) ~ O(N*log(N))
   private static int solution(int[] A) {
      int rs = 1;
      
      Arrays.sort(A);
      int tmp = -1;
      for(int i=0; i<A.length; i++) {
         if(A[i]==1) {
            for(int j=i+1; j<A.length; j++) {
               tmp = A[j-1];
               //System.out.println(tmp + " / " + A[j]);
               if(A[j] - tmp > 1) {
                  return tmp+1;
               }
            }
            return A[A.length-1]+1;
         }
      }
      
      
      return rs;
   }
   
}
