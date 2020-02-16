package Java.reflection;

public class ExampleClass {
   
   public int privateMethod(Object a, int b) throws NullPointerException {
      if(a == null) {
         throw new NullPointerException();
      }
      return b;
   }
}
