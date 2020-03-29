package algo_codility;

public class L3_FrogJump {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int r = solution(1, 5, 2);
      System.out.println(r);
   }
   
   private static int solution(int X, int Y, int D) {
      
      int target = Y-X;
      
      int r = target % D;
      if(r != 0) {
         return (target / D) + 1;
      } else {
         return target / D;
      }
   }
   
}
