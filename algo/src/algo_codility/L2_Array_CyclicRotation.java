package algo_codility;

public class L2_Array_CyclicRotation {

   public static void main(String[] args) {
      int[] A = {3, 8, 9, 7, 6};
      int K = 3;
      
      int[] rs = solution(A, K);
      for(int i:rs) {
         System.out.print(i + " ");
      }
      
   }
   
   //O(N)
   public static int[] solution(int[] A, int K) {
      if(A == null || A.length < 1) return A;
      if(K == 0) return A;
      
      int[] rs = new int[A.length];
      
      int r = K%A.length;
      
      int idx = 0;
      for(int i=A.length-r; i<A.length; i++) {
         rs[idx] = A[i];
         idx++;
      }
      int idx2 = 0;
      for(int i=r; i<A.length; i++) {
         rs[i] = A[idx2];
         idx2++;
      }
      
      return rs;
   }
}
