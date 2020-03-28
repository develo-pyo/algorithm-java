package algo_codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class L2_Array_OddOccurrencesInArray {

   public static void main(String[] args) {
      int[] arr = {9, 3, 9, 3, 9, 7, 9};
      int rs = solution(arr);
      System.out.println(rs);
   }
   
   //O(N^2)
//   public static int solution(int[] A) {
//      List<Integer> list = new ArrayList<>();
//      
//      for(int i=0; i<A.length; i++) {
//         if(!list.contains(A[i])) {
//            list.add(A[i]);
//         } else {
//            for(int j=0; j<list.size(); j++) {
//              if(list.get(j) == A[i]) {
//                 list.remove(j);
//              }
//            }
//         }
//      }
//      
//      return list.get(0);
//   }
   
   
   //O(N) ~ O(NlogN)
   public static int solution(int[] A) {
      
      Map<Integer, Integer> map = new HashMap<>();
      
      for(int i : A) {
         int val = map.getOrDefault(i, 0)+1;
         map.put(i, val);
      }
      
      Set<Integer> set = map.keySet();
      for(int i : set) {
         if(map.get(i)%2!=0) {
            return i;
         }
      }
      return -1;
   }
}
