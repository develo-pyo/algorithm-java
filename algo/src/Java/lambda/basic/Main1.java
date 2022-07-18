package Java.lambda.basic;

public class Main1 {
   
   //java lambda
   //jdk 1.8~
   //함수형 프로그래밍
   //인터페이스 + 익명객체 + 람다식
   //1회용 익명 메소드가 필요할 때 람다를 사용 
   
   //참고 https://futurecreator.github.io/2018/07/20/java-lambda-type-inference-functional-interface/
   public static void main(String[] args) {

      //기존 익명객체를 사용한 구현 방식
      Interface i = new Interface() {
         @Override
         public void sayHello() {
            System.out.println("HELLO! in anonymous class");
         }
      };
      i.sayHello();
      
      //lamda 는 Functional Interface 에만 사용이 가능하다
      Interface lamda = () -> {
         System.out.println("HELLO! in anonymous method(lambda)");
      };
      lamda.sayHello();
   }
   
   //@FunctionalInterface 는 abstract method 가 오직 1개여야 한다.
   @FunctionalInterface
   interface Interface {
      void sayHello();
   }
}
