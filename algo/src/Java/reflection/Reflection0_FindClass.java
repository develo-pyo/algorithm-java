package Java.reflection;

import java.lang.reflect.Method;

public class Reflection0_FindClass {

   public static void main(String[] args) throws Exception {
      
      //클래스 이름으로 찾기
      Class clazz = Class.forName("Java.reflection.ExampleClass");
      
      //클래스 바로 넣기
      Class clazz1 = ExampleClass.class;
      
      Method methodArr[] = clazz1.getDeclaredMethods();
      
      for(Method m : methodArr) {
         System.out.println("name = " + m.getName());
         System.out.println("class = " + m.getDeclaringClass());
         m.getExceptionTypes();
      }
   }
   
}
