package algo_codility;

import java.util.Stack;

//https://app.codility.com/c/run/training5JHDDX-6XT/
public class L7_Brackets {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String S = "[({";
      System.out.println(solution(S));
   }

   // O(N)
   private static int solution(String S) {
      if(S==null || S.isEmpty()) {
         return 1;
      }
      
      Stack<Character> stack = new Stack<>();
      
      for(int i=0; i<S.length(); i++) {
         char target = S.charAt(i);
         if(target == '{' || target == '[' || target == '(') {
            stack.push(target);
         } else {
            if(stack.isEmpty()) {
               return 0;
            }
            char top = stack.pop();
            if((target == ')' && top != '(') 
                  || (target == '}' && top != '{') 
                  || (target == ']' && top != '[')) {
               return 0;
            } 
         }
      }
      
      return stack.isEmpty()?1:0;
   }
   
   
}
