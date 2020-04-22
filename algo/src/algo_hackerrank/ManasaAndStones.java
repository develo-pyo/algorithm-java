package algo_hackerrank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] r = stones(4, 10, 100);
      for(int i:r) {
         System.out.print(i+" ");
      }
   }
   
   private static int[] stones(int n, int a, int b) {
      Set<Integer> set = new TreeSet<>((a1, a2)->a1-a2);
      
      
      for(int i=0; i<n; i++) {
         int sum = 0;
         sum += a*i;
         sum += b*(n-1-i);
         set.add(sum);
      }
      
      int[] rs = new int[set.size()];
      
      Iterator<Integer> iter = set.iterator();
      int i=0;
      while(iter.hasNext()) {
         rs[i] = iter.next();
         i++;
      }
      
      return rs;
   }
   
}
