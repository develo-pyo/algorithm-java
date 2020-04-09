package algo_hackerrank;

import java.util.Arrays;

public class BeautifulTriplets {

   public static void main(String[] args) {
      int d = 1;
      int arr[] = {2, 2, 3, 4, 5};
      System.out.println(beautifulTriplets(d, arr));
   }

   private static int beautifulTriplets(int d, int[] arr) {
      int rs = 0;
      
      Arrays.sort(arr);
      
      for(int i=0; i<arr.length-2; i++) {
         for(int j=i+1; j<arr.length-1; j++) {
            for(int k=j+1; k<arr.length; k++) {
               if(arr[j]-arr[i] != d) {
                  break;
               } else {
                  if(arr[k]-arr[j] == d)rs++;  
               }  
            }
         }
      }
      
      return rs;
   }
}
