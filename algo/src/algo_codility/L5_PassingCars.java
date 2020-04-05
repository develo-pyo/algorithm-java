package algo_codility;

public class L5_PassingCars {

   public static void main(String[] args) {
      int arr[] = {0, 1, 0, 1, 1};
//      System.out.println("result : " + solution(arr));
      System.out.println("solu2 : " + solution2(arr));
   }
   
   //O(N^2)
   private static int solution(int[] A) {
      int rs = 0;
      
      for(int i=0; i<A.length; i++) {
         if(A[i]==0) {
            for(int j=i+1; j<A.length; j++) {
               if(A[j]==1)rs++;
            }
         } 
      }
      
      return rs;
   }

   //O(N)
   private static int solution2(int[] A) {
      int mul = 0;
      int cnt = 0;
      
      // mul  1 2 2 2
      // cnt  1 1 3 5
      for(int i = 0 ; i<A.length ; i++){
          if(A[i] == 0) mul++;
          else cnt = cnt+mul;

          if(cnt>1000000000) return -1;
      }

      return cnt;
   }
}
