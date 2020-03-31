package algo_codility;

import java.util.HashSet;
import java.util.Set;

public class L4_FrogRiverOne {

   public static void main(String[] args) {
      int arr[] = {1,3,1,4,2,3,5,4};
      int r = solution(5, arr);
      System.out.println(r);
   }
   //O(N)
   private static int solution(int X, int[] A) {
      
      Set<Integer> set = new HashSet<>();
      
      int idx = 0;
      for(int i : A) {
         if(!set.contains(i))set.add(i);
         if(set.size()==X)return idx;
         idx++;
      }
      
      return -1;
   }
}
