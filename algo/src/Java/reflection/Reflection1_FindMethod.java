package Java.reflection;

import java.lang.reflect.Method;

public class Reflection1_FindMethod {

   public static void main(String[] args) throws Exception {
      
      //Class clazz = ExampleClass.class;

      //class 명을 기준으로
      //패키지 경로까지
      Class clazz = Class.forName("Java.reflection.ExampleClass");
      Method methodArr[] = clazz.getDeclaredMethods();
      
      for(Method m : methodArr) {
         System.out.println("name = " + m.getName());
         System.out.println("class = " + m.getDeclaringClass());
         m.getExceptionTypes();
      }
   }
   
}
