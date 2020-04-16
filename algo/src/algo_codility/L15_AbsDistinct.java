package algo_codility;

import java.util.HashSet;
import java.util.Set;

public class L15_AbsDistinct {

   public static void main(String[] args) {
      int[] arr = {-5,-3,-1,0,3,6};
      System.out.println(solution(arr));
   }
   
   //O(N)~O(Nlog(N))
   private static int solution(int[] A) {
      
      Set<Integer> set = new HashSet<>();
      for(int a : A) {
         set.add(Math.abs(a));
      }
      
      return set.size();
   }
   
}
