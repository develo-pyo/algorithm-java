package algo_hackerrank;

public class IceCreamParlor {
   //hackerrank, easy, icecream parlor
   //https://www.hackerrank.com/challenges/icecream-parlor/problem
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] cost = {1, 2, 3, 5, 6};
      int[] rs = icecreamParlor(4 , cost);
      for(int i : rs) {
         System.out.print(i + " ");
      }
   }
   
   static int[] icecreamParlor(int m, int[] arr) {
      int[] rs = new int[2];
      
      for(int i=0; i<arr.length; i++) {
         
         for(int j=i+1; j<arr.length; j++) {
            if(arr[i] + arr[j] == m) {
               rs[0] = i+1;
               rs[1] = j+1;
               break;
            }
         }
      }
      
      return rs;
   }

}
