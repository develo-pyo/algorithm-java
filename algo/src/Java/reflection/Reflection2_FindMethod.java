package Java.reflection;

import java.lang.reflect.Method;

//Method 정보 가져오기
public class Reflection2_FindMethod {

   public static void main(String[] args) throws Exception {
      
      //1. class 가져오기
      Class clazz = Class.forName("Java.reflection.ExampleClass");
      
      //2. class 에서 method 가져오기
      Method methodArr[] = clazz.getDeclaredMethods();
      
      for(Method method : methodArr) {
         
         //1) 메소드명 가져오기
         System.out.println("name = " + method.getName());
         
         //2) 선언된 클래스명 가져오기
         System.out.println("class = " + method.getDeclaringClass());
         
         //3) Parameter Type 가져오기
         Class paramTypes[] = method.getParameterTypes();
         for(Class p : paramTypes) {
            System.out.println("param type : " + p);
         }
      
         //4) exception Type 가져오기
         Class exceptionTypes[] = method.getExceptionTypes();
         for(Class e : exceptionTypes) {
            System.out.println("exception type : " + e);
         }
         
         //5) return Type 가져오기
         System.out.println("return type : "+method.getReturnType());
         
         System.out.println();
      }
      
      
   }
   
}
