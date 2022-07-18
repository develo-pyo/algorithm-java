package algo_hackerrank;

public class FindPrimeNumber {

   public static void main(String[] args) {
      solution("51");
   }
   
   private static int solution(String numbers) {
      int answer = 0;
      int[] arr = new int[numbers.length()];
      
      for(int i=0; i<numbers.length(); i++) {
         arr[i] = Integer.parseInt(Character.toString(numbers.charAt(i)));
      }
      
      for(int i=0; i<arr.length; i++) {
         for(int j=0; j<arr.length; j++) {
            if(i!=j) {
               int tmp = Integer.parseInt(Integer.toString(i+j));
               if(isPrimeNumber(tmp)==1)answer++;
            }
            
         }
      }
      
      return answer;
   }
   
   //0소수아님 1소수
   private static int isPrimeNumber(int num) {
      int last=num/2;
      if(num==1) {
         return 0;
      }
      for(int i=2; i<=last; i++) {
         if(num%i==0) {
            return 0;
         }
      }
      
      return 1;
   }
   
}
