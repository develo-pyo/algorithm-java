package algo_hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//hackerrank easy
//https://www.hackerrank.com/challenges/beautiful-pairs/problem
public class BeautifulPairs {

   public static void main(String[] args) {
      int[] A = {1,2,3,4,5};
      int[] B = {1,2,3,3,5};
      System.out.println(beautifulPairs(A, B));
   }
   
   //2 case fail..

   private static int beautifulPairs(int[] A, int[] B) {
      int rs = 0;
      
      Map<Integer, Integer> mapA = new HashMap<>();
      
      for(int a : A) {
         mapA.put(a, mapA.getOrDefault(a, 0)+1);
      }
      
      Map<Integer, Integer> mapB = new HashMap<>();
      
      for(int b : B) {
         mapB.put(b, mapB.getOrDefault(b, 0)+1);
      }
      
      Set<Integer> setA = mapA.keySet();
      Iterator<Integer> iterA = setA.iterator();
      
//      boolean t=false;
      int duplicate = 0;
      int notSame = 0;
      while(iterA.hasNext()) {
         int tmp = iterA.next();
         if(mapB.containsKey(tmp)) {
            rs += Math.min(mapA.get(tmp), mapB.get(tmp));
            if(mapA.get(tmp) != mapB.get(tmp)) {
               duplicate++;
            }
         }else {
            notSame++;
//            t=true;
         }
      }
      
      if(notSame > 0 || duplicate > 0) {
         rs++;
      }
      
//      if(t)rs++;
      
      return rs;
   }

}
