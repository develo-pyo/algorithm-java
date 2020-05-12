package algo_hackerrank;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/anagram/problem
public class Anagram {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println(anagram("xaxbbbxx"));
   }
   
   private static int anagram(String s) {
      if(s.length()%2 != 0) {
         return -1;
      }
      
      String front = "";
      List<Character> back = new ArrayList<>();
      for(int i=0; i<s.length()/2; i++) {
         front += s.charAt(i);
         back.add(s.charAt(s.length()-i-1));
      }
      
      for(int i=0; i<front.length(); i++) {
         for(int j=0; j<back.size(); j++) {
            if(front.charAt(i) == back.get(j)) {
               back.remove(j);
               break;
            }
         }
      }
      
      return back.size();
   }
   
}
