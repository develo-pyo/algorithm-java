package Java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//https://jeong-pro.tistory.com/165
public class JavaStream {

   public static void main(String[] args) {
      
      ex1();
      construct();
   }
   
   
   private static void ex1() {
      List<String> emails = Arrays.asList("pyo@gmail.com", "jp@naver.com", "pyo_9@gmail.com");
      
      long cnt=0;
      for(String s : emails) {
         if(s.contains("_")) {
            cnt++;
         }
      }
      System.out.println("rs : " + cnt);
      
      cnt = emails.stream().filter(x -> x.contains("_")).count();
      System.out.println("rs of using stream : " + cnt);
   }
   
   
   //스트림생성
   private static void construct() {
      //1. Collection으로 스트림 생성
      //collection.stream();
      List<String> names = Arrays.asList("pyo", "sue");
      names.stream();
      
      //2. 배열로 스트림 생성
      //array.stream();
      int[] arr = {1, 2, 3};
      Arrays.stream(arr);  
      
      //3. 스트림 직접 생성
      //Stream.of(~);
      Stream<Integer> stream = Stream.of(1,2,3);   
      stream.forEach(x -> System.out.println(x));
   }
   
   //
   
   
   
   
}
