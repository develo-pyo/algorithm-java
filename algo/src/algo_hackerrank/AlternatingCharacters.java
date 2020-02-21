package algo_hackerrank;

public class AlternatingCharacters {
   
   //hackerrank easy https://www.hackerrank.com/challenges/alternating-characters/problem
   public static void main(String[] args) {
      int r = alternatingCharacters("ABBB");
      System.out.println(r);
   }

   static int alternatingCharacters(String s) {
      int rs = 0;
      
      char start = s.charAt(0);
      
      for(int i=1; i<s.length(); i++) {
         int cnt = 0;
         if(start == s.charAt(i)) {
            start = s.charAt(i);
            cnt++;
         } else {
            start = s.charAt(i);
         }
         rs+=cnt;
      }
      
      return rs;
   }

}
