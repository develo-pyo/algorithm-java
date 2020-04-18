package algo_codility;

import java.util.Arrays;

public class L15_MinAbsSumOfTwo {

   public static void main(String[] args) {
      int[] A = {-8, 4, 5, -10, 3};
      System.out.println(solution2(A));
   }
   
   //O(N*N)
   private static int solution(int[] A) {
      int rs = Integer.MAX_VALUE;
      
      for(int i=0; i<A.length; i++) {
         for(int j=0; j<A.length; j++) {
            rs = Math.min(rs, Math.abs(A[i]+A[j])); 
         }
      }
      
      return rs;
   }
   
   //O(N*log(N))
   private static int solution2(int[] A) {
      int rs = Integer.MAX_VALUE;
      
      Arrays.sort(A);
      
      //-10 -8 3 4 5
      int front = 0;
      int back = A.length-1;
      
      while(front<=back) {
         System.out.println(front+"/"+back);
         int sum = A[front] + A[back];
         rs = Math.min(rs,  Math.abs(sum));
         if(sum <= 0) { //이부분의 조건이 중요
            front++;
         } else {
            back--;
         }
      }
      
      return rs;
   }
   
   
}
