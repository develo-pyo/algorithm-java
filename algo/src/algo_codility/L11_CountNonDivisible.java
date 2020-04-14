package algo_codility;

public class L11_CountNonDivisible {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] arr = {3,1,2,3,6};
      for(int i : solution(arr)) {
         System.out.print(i+" ");
      }
   }
   
   //O(n^2) 55%
   private static int[] solution(int[] A) {
      int rs[] = new int[A.length];
      
      for(int i=0; i<A.length; i++) {
         for(int j=0; j<A.length; j++) {
            if(A[i] < A[j]) {
               rs[i] = rs[i]+1;
            } else {
               if(A[i]%A[j]!=0) {
                  rs[i] = rs[i]+1;
               }
            }
         }
      }
      
      return rs;
   }
   
   
   
   
}
