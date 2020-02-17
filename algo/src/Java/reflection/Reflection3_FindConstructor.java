package Java.reflection;

import java.lang.reflect.Constructor;

//Constructor 정보 가져오기
public class Reflection3_FindConstructor {
     
   public static void main(String[] args) throws Exception {
      
      //1. class 가져오기
      Class clazz = ExampleClass.class;
      
      //2. class 에서 Constructor 가져오기
      Constructor constructors[] = clazz.getDeclaredConstructors();
      
      for(Constructor c : constructors) {
         
         //1) 생성자명 가져오기
         System.out.println("name : " + c.getName());
         
         //2) 선언된 클래스명 가져오기
         System.out.println("class : " + c.getDeclaringClass());
         
         //3) parameter type 가져오기
         Class paramTypes[] = c.getParameterTypes();
         for(Class p : paramTypes) {
            System.out.println("param type : " + p);
         }
      
         //4) exception Type 가져오기
         Class exceptionTypes[] = c.getExceptionTypes();
         for(Class e : exceptionTypes) {
            System.out.println("exception type : " + e);
         }
         
         //5) 생성자에 return type은 존재하지 않으므로 getReturnType() 메소드는 없음 
         System.out.println();
      }
      
      
      
   }
   
}
