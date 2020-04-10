package algo_codility;

import java.util.Stack;

public class L7_Nesting {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String S = "((()()()))";
      System.out.println(solution2(S));
   }

   //O(3N)
   private static int solution2(String S) {
      if(S==null || S.isEmpty())return 1;
      
      int l = S.length()/2;
      
      for(int i=0; i<l; i++) {
         S=S.replaceAll("\\(\\)", "");
         if(S.isEmpty())return 1;
      }
      
      return S.isEmpty()?1:0;
   }
   
   //O(N)
   private static int solution(String S) {
      
      if(S==null || S.isEmpty())return 1;
      
      Stack<Character> stack = new Stack<>();
      
      for(int i=0; i<S.length(); i++) {
         char target = S.charAt(i);
         
         if(target == '(') {
            stack.push(target);
         } else {
            if(stack.isEmpty()) {
               return 0;
            }
            stack.pop();
         }
         
      }
      
      return stack.isEmpty()?1:0;
   }

}
