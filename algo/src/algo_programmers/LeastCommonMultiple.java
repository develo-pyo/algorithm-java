package algo_programmers;

import java.util.Arrays;

public class LeastCommonMultiple {
//   두 수의 최소공배수(Least Common Multiple)란 입력된 
//   두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
//   예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, 
//   n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. 
//   n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, 
//   solution을 완성해 주세요.
   public static void main(String[] args) {
      
      int[] arr = {2, 6, 8, 14};
      int rs = solution(arr);
      System.out.println(rs);
   }
   
   private static int solution(int[] arr) {
      Integer[] tmpArr = new Integer[arr.length];
      int i=0;
      for(int n : arr) {
         tmpArr[i] = n;
         i++;
      }
      
      Arrays.sort(tmpArr, (x, y) -> y-x);
      int st = tmpArr[0];
      int posLCM = st;
      int idx=1;
      System.out.println("?:"+posLCM);
      while(true) {
         int cnt = 0;
         for(int k : tmpArr) {
            if(posLCM % k == 0) {
               System.out.println("::"+posLCM);
               cnt++;
            } else {
               break;
            }
         }
         if(cnt == tmpArr.length) {
            System.out.println("cnt : "+cnt+","+posLCM);
            return posLCM;
         }
         idx++;
         posLCM = st*idx;
      }
  }

}
