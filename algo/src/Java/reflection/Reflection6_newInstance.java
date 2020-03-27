package Java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//https://kaspyx.tistory.com/80

//5. 메소드 실행시키기 invoke
public class Reflection6_newInstance {
   
   public Reflection6_newInstance() {}
   
   public Reflection6_newInstance(String a) {}
   
   public Reflection6_newInstance(String a, Object b) {}
   
   public String addStrInt(String a, int b) {
      return a+b;
   }
   
   @SuppressWarnings({ "unchecked", "rawtypes" })
   public static void main(String[] args) throws Exception {
      
      Class clazz = Reflection6_newInstance.class;
      
      Class arguTypes[] = new Class[2];
      arguTypes[0] = String.class;
      arguTypes[1] = Integer.TYPE;

      Object params[] = new Object[2];
      params[0] = "Str ";
      params[1] = 10;
      
      Constructor myConstructor1 = clazz.getConstructor();     
      Object myObj = myConstructor1.newInstance();             
      Method m1 = clazz.getMethod("addStrInt", arguTypes); 
      String result1 = (String) m1.invoke(myObj, params);   
      System.out.println(result1);
      
      Constructor myConstructor2 = clazz.getConstructor(String.class);
      Object myObj2 = myConstructor2.newInstance("");
      Method m2 = clazz.getMethod("addStrInt", arguTypes);
      String result2 = (String) m2.invoke(myObj2, params);
      System.out.println(result2);
      
      Constructor myConstructor3 = clazz.getConstructor(String.class, Object.class);
      Object myObj3 = myConstructor3.newInstance("", new Object());
      Method m3 = clazz.getMethod("addStrInt", arguTypes);
      String result3 = (String) m3.invoke(myObj3, params);
      System.out.println(result3);
      
      Constructor myConstructor4 = clazz.getConstructor(new Class[]{String.class, Object.class});
      Object myObj4 = myConstructor4.newInstance("", new Object());
      Method m4 = clazz.getMethod("addStrInt", new Class[] {String.class, Integer.TYPE});
      String result4 = (String) m4.invoke(myObj4, new Object[] {"String " , 11});
      System.out.println(result4);
      
   }
   
}
