package Java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

//https://jeong-pro.tistory.com/165
public class JavaStream {
   
   private static List<String> names = Arrays.asList("pyo", "sue", "aron", "ballack", "pyo");

   public static void main(String[] args) {
      ex1();
      construct();
      middle();
   }
   
   //Stream 을 사용하는 이유
   private static void ex1() {
      //기존 문법
      List<String> emails = Arrays.asList("pyo@gmail.com", "jp@naver.com", "pyo_9@gmail.com");
      long cnt=0;
      for(String s : emails) {
         if(s.contains("_")) {
            cnt++;
         }
      }
      System.out.println("rs of not using stream : " + cnt);
      
      //Stream 적용 문법
      cnt = emails.stream().filter(x -> x.contains("_")).count();
      System.out.println("rs of using stream : " + cnt);
      System.out.println("\n-----------------------------");
   }
   
   
   //Stream 문법
   //객체집합.스트림생성().중개연산().최종연산() 와 같이 파이프라인으로 작성
   
   //1. 스트림생성
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
   }

   
   //2. 중개연산
   private static void middle() {
      //2-1. Filter : 특정 조건에 부합하는 데이터만 뽑을 때 사용
      long cnt = names.stream().filter(new Predicate<String>() {
         @Override
         public boolean test(String t) {
            return t.contains("y");
         }
      }).count();
      System.out.print("result of counting after filtering : " + cnt);
      System.out.println("\n-----------------------------");
      
      //2-2. Map : 특정 연산을 할 때 사용
      names.stream().map(new Function<String, String>() {
         @Override
         public String apply(String t) {
            return t.concat("@gmail.com");
         }
      }).forEach(x -> System.out.print(x+" "));
      System.out.println("\n-----------------------------");
      
      //2-3. sort : 정렬
      names.stream().sorted((x1, x2)->x1.compareTo(x2)).forEach(x->System.out.print(x+" "));
      System.out.println("\n-----------------------------");
      
      //2-4. limit : 출력 수 제한
      names.stream().limit(2).forEach(x->System.out.print(x+" "));
      System.out.println("\n-----------------------------");
      
      //2-5. distinct : 중복 제거
      names.stream().distinct().forEach(x->System.out.print(x+" "));
      System.out.println("\n-----------------------------");
      
   }
   
   //3. 최종연산
   private static void finalOperate() {
      names.stream().forEach(x->System.out.print(x+" "));
      names.stream().count();
      //names.stream().max();
   }
   
   
}
