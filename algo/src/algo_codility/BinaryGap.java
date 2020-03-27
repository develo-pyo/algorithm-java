package algo_codility;

public class BinaryGap {
   
   public static void main(String[] args) {
      int rs = solution(529);
      System.out.println(rs);
   }
   
   
   public static int solution(int N) {
      String bi = Integer.toBinaryString(N);
      
      int biggest = 0;
      int buffer = 0;
      boolean flag = false;
      for(int i=0; i<bi.length(); i++) {
         if(bi.charAt(i)=='0') {
            buffer++;
         } else {
            if(biggest < buffer) {
               biggest = buffer;
            }
            buffer = 0;
         }
      }
      
      return biggest;
   }
   
}
