package algo_hackerrank;

public class TheLoveLetterMystery {
   
   //hackerrank
   //https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
   public static void main(String[] args) {
      System.out.println(theLoveLetterMystery("abc"));
      System.out.println("-----------");
      System.out.println(theLoveLetterMystery("abbd"));
      System.out.println("-----------");
      System.out.println(theLoveLetterMystery("abcd"));
   }
   
   static int theLoveLetterMystery(String s) {
      int result = 0;
      
      int mid = s.length()/2;
      
      for(int i=0; i<mid; i++) {
         int front = s.charAt(i);
         int back = s.charAt(s.length()-i-1);
         result += Math.abs(back-front);
      }
      
      return result;
   }
   
}
