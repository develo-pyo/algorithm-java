package algo_hackerrank;

public class SmartNumber {

   public static void main(String[] args) {
      
      System.out.println(isSmartNumber(169));
   }
   
   private static boolean isSmartNumber(int num) {
      double v = Math.sqrt(num);
      int iv = (int)v;
      if(iv == v) {
         return true;
      }
      return false;
   }

}
