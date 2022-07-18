package Java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//https://kaspyx.tistory.com/80

//5. 메소드 실행시키기 invoke
public class Reflection5_invoke_1 {
   
   public Reflection5_invoke_1() {}
   
   public Reflection5_invoke_1(String a) {}
   
   public Reflection5_invoke_1(String a, Object b) {}
   
   public String addStrInt(String a, int b) {
      return a+b;
   }
   
   @SuppressWarnings({ "unchecked", "rawtypes" })
   public static void main(String[] args) throws Exception {
      
      //1. class 가져오기
      Class clazz = Reflection5_invoke_1.class;
      
      Class paramTypes[] = new Class[2];
      paramTypes[0] = String.class;
      paramTypes[1] = Integer.TYPE;
      Method method = clazz.getMethod("addStrInt", paramTypes);   //* private modifier method 는 찾지 못한다

      Reflection5_invoke_1 methodObj = new Reflection5_invoke_1();
      Object argumentList[] = new Object[2]; 
      argumentList[0] = "Str ";
      argumentList[1] = new Integer(10);
      
      //java 문법은 보통 아래와 같이 S V O 
      //String rs = addStrInt("a", 10);
      //하지만, reflection 은 V.invoke(S, O)
      Object rs = method.invoke(methodObj, argumentList);
      
      System.out.println(rs);
      
   }
   
}
