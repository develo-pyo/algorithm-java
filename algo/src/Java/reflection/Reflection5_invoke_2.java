package Java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//https://kaspyx.tistory.com/80

//5. 메소드 실행시키기 invoke
public class Reflection5_invoke_2 {
   
   public Reflection5_invoke_2() {}
   
   public Reflection5_invoke_2(String a) {}
   
   public Reflection5_invoke_2(String a, Object b) {}
   
   public String addStrInt(String a, int b) {
      return a+b;
   }
   
   @SuppressWarnings({ "unchecked", "rawtypes" })
   public static void main(String[] args) throws Exception {
      
      Method m = ExampleChildClass.class.getMethod("addStrInt", new Class[] {String.class, Integer.TYPE});
      String result = (String) m.invoke(new ExampleClass(), new Object[]{"Str ", new Integer(10)});
      System.out.println(result);
      
      //위와 같다
      Method m3 = ExampleChildClass.class.getMethod("addStrInt", new Class[] {String.class, Integer.TYPE});
      String result3 = (String) m3.invoke(new ExampleClass(), new Object[]{"Str ", new Integer(10)});
      System.out.println(result3);
      
      try {
         Method m2 = ExampleClass.class.getMethod("addStrInt", new Class[] {String.class, Integer.TYPE});
         String result2 = (String) m2.invoke(new ExampleSuperClass(), new Object[]{"Str ", new Integer(10)});
         System.out.println(result2);
      } catch (IllegalArgumentException ie) {
         System.out.println(ie.getMessage());
      }
      
   }
   
}
