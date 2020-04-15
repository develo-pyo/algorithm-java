package algo_codility;

public class L12_ChocolatesByNumbers {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println(solution(1, 1));
   }
   
   public static int solution(int N, int M) {
        return N / gcdByDivision(N, M);
   }
   

   private static int gcdByDivision(int A, int B) {
      if(A % B == 0) return B;
      else           return gcdByDivision(B, A % B);
   }
   
}
