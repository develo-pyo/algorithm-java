package Java.reflection;

//https://gyrfalcon.tistory.com/entry/Java-Reflection

//instance of
public class Reflection1_instanceof {
   public static void main(String[] args) {
      
      //classA.isInstance(B);
      //B가 A의 인스턴스인지를 확인
      Class clazz = ExampleClass.class;
      
      boolean rs1 = clazz.isInstance(new ExampleSuperClass());
      System.out.println(rs1);
      boolean rs2 = clazz.isInstance(new ExampleClass());
      System.out.println(rs2);
      boolean rs3 = clazz.isInstance(new ExampleChildClass());
      System.out.println(rs3);

   }
}
