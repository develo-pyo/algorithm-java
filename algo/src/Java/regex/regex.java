package Java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      System.out.println(regex("abc_9"));
      System.out.println(regex("a9_"));
      System.out.println(regex("edf32"));
      System.out.println(regex("wei_0d"));
      System.out.println(regex("fe__13d"));
      System.out.println(regex("_ie9"));
      System.out.println(regex("i_e9"));
      
   }

   //정규식 정리 잘되어있는 곳
   //https://offbyone.tistory.com/400
   
   //정규식 문제 예제
   //https://itpangpang.xyz/245
   
   //정규식 푸는곳
   //https://regexr.com/
   private static boolean regex(String input) {
      if(input == null || input.length() < 4) {
         return false;
      }
      if(input.length() != input.replaceAll("_", "").length()+1) {
         return false;
      }
      
      String regex = "^[a-zA-Z]{1}[a-zA-Z0-9].*?[^_]$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(input);
      if(m.matches()) {
         return true;
      } else {
         return false;
      }
   }
}
