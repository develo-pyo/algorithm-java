package algo_codility;

public class L3_TapeEquilibrium {

   public static void main(String[] args) {
      int[] arr = {3,1,2,4,3};
                                     
      System.out.println(solution(arr));
   }
   
   //O(N)
   private static int solution(int[] A) {
      
      int totalSum = 0;
      for(int a:A) {
         totalSum += a;
      }
      int leftSum = 0;
      int rightSum = 0;
      int min = Integer.MAX_VALUE;
      
      for(int i=1; i<A.length; i++) {
         leftSum += A[i-1];
         rightSum = totalSum - leftSum;
         int diff = Math.abs(leftSum-rightSum);
         if(min > diff) {
            min = diff;
         }
      }
      
      return min;
   }
}
