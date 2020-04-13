package algo_codility;

public class L10_MinPerimeterRectangle {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println(solution(101));
   }
   
   //O(N) 50%
   private static int solution(int N) {
      int min = N;
      int num = 1;
      if(N==1)return 4;
      
      for(int i=1; i<=N/2; i++) {
         
         if(N%i == 0) {
            
            int tmp = Math.abs(i-N/i);
            
            if(min > tmp) {
               num = i;
               min = tmp;
            }
         }
      }
      
      return (num+(num+min))*2;
   }
   
}
