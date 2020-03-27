package Java.reflection;

public class ExampleClass extends ExampleSuperClass {
   
   private static final String CONSTANT_FIELD = "constant_field";
   public int i = 1;
   public String publicField = "publicStrField";
   private String privateField = "privateStrField";
   
   public ExampleClass() { 
   }
   
   public ExampleClass(Object a) throws NullPointerException {
   }
   
   private int privateMethod(Object a, int b) throws NullPointerException {
      if(a == null) {
         throw new NullPointerException();
      }
      return b;
   }
   
   public String addStrInt(String a, int b) {
      return a+b;
   }
}