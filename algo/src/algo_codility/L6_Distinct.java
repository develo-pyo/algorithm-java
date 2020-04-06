package algo_codility;

import java.util.HashSet;
import java.util.Set;

//https://app.codility.com/c/run/trainingEJEF5B-HDA/
public class L6_Distinct {

   public static void main(String[] args) {
      int arr[] = {-1,-2,-1,-3,-2};
      System.out.println(solution(arr));
   }
   
   private static int solution(int[] A) {
      Set<Integer> set = new HashSet<>();
      
      for(int i : A) {
         set.add(i);
      }
      
      return set.size();
   }
   
   
}
