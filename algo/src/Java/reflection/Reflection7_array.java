package Java.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//https://kaspyx.tistory.com/80

//5. 메소드 실행시키기 invoke
public class Reflection7_array {
   
   public static void main(String[] args) throws Exception {
      
      int dims[] = {21, 22, 54};
      Object arr = Array.newInstance(Integer.TYPE, dims);
      
      int arrobj = (int) Array.get(arr, 2);

      System.out.println(arrobj);

      
      
//      int dims[] = { 5, 10, 15 };
//      Object arr = Array.newInstance(Integer.TYPE, dims);
//
//      Object arrobj = Array.get(arr, 3);
//      Class cls = arrobj.getClass().getComponentType();
//      System.out.println(cls);
//
//      arrobj = Array.get(arrobj, 5);
//      Array.setInt(arrobj, 10, 37);
//
//
//
//      int arrcast[][][] = (int[][][]) arr;
//      System.out.println(arrcast[3][5][10]);

   }
   
}
