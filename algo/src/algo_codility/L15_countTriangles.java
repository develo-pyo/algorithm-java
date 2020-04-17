package algo_codility;

public class L15_countTriangles {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] arr = {10, 2, 5, 1, 8, 12};
      System.out.println(solution(arr));
   }
   
   //O(N^3)
   private static int solution(int[] A) {
      int rs = 0;
      
      for(int a=0; a<A.length; a++) {
         for(int b=a+1; b<A.length; b++) {
            for(int c=b+1; c<A.length; c++) {
               if(A[a] + A[b] > A[c] && A[b] + A[c] > A[a] && A[c] + A[a] > A[b]) {
                  rs++;
               }
            }
         }
      }
      
      return rs;
   }
}
