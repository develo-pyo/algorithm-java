package algo_hackerrank;

public class XORStrings {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String res = stringsXOR("10101", "00101");
      System.out.println(res);
   }
   
   public static String stringsXOR(String s, String t) {
      String res = "";
      
      for(int i=0; i<s.length(); i++) {
         if(s.charAt(i) == t.charAt(i)) {
            res += "0";
         } else {
            res += "1";
         }
      }
      
      return res;
   }
   
}
