package algo_hackerrank;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class MarkandToys {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] arr = {1,2,4,7};
      int rs = maximumToys(arr, 7);
      System.out.println(rs);
   }
   
   private static int maximumToys(int[] prices, int k) {
      
      Arrays.sort(prices);
      int sum = 0;
      int idx = 0;
      while(sum <= k) {
         sum+=prices[idx];
//         System.out.println(sum);
         idx++;
      }
      
      return idx<1?idx:--idx;
   }
   
}
