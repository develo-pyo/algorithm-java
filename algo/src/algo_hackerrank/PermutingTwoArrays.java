package algo_hackerrank;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/two-arrays/problem
//easy, greedy
public class PermutingTwoArrays {

   public static void main(String[] args) {
      int k = 10;
      int[] A = {2,1,3};
      int[] B = {7,8,9};
      System.out.println(twoArrays(k, A, B));
   }

   private static String twoArrays(int k, int[] A, int[] B) {
      Arrays.sort(A);
      Integer[] BB = new Integer[B.length];
      for(int i=0; i<B.length; i++) {
         BB[i] = B[i];
      }
      Arrays.sort(BB, (a1, a2)->a2-a1);
      
      for(int i=0; i<A.length; i++) {
         if(A[i]+BB[i] < k) {
            return "NO";
         }
      }
      
      return "YES";
   }
   
}
