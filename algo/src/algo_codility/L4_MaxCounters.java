package algo_codility;

import java.util.ArrayList;
import java.util.List;

public class L4_MaxCounters {
   
   //TIMEOUT, 77%
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int N = 5;
      int[] A = {3, 4, 4, 6, 1, 4, 4};
      for(int i : solution(N, A)) {
         System.out.print(i + " ");
      }
   }
   
   private static int[] solution(int N, int[] A) {
      int[] rs = new int[N];
      int max = 0;
      for(int i=0; i<A.length; i++) {
         if(1 <= A[i] && A[i] <= N) {
            rs[A[i]-1] = rs[A[i]-1]+1;
            if(rs[A[i]-1] > max)max = rs[A[i]-1]; 
         } 
         if(A[i] == N+1) {
            for(int j=0; j<N; j++) {
               rs[j] = max;
            }
         }
         printArr(rs);
      }
      
      return rs;
   }
   
   private static void printArr(int[] rs) {
      for(int a : rs) {
         System.out.print(a + " ");
      }
      System.out.println();
   }
}
