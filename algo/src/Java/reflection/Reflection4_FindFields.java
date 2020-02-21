package Java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//Field 정보 가져오기
public class Reflection4_FindFields {
   
   public static void main(String[] args) throws Exception {
      
      //1. class 가져오기
      Class clazz = ExampleClass.class;
      
      //2. class 에서 Field 가져오기
      //Field fields[] = clazz.getFields();        //public modifier(접근제한자) field 만 가져올 수 있다
      Field fields[] = clazz.getDeclaredFields();  //private modifier field 도 가져올 수 있다
      
      for(Field f : fields) {
         
         //1) 필드명 가져오기
         System.out.println("name : " + f.getName());
         
         //2) 필드가 선언된 클래스명 가져오기
         System.out.println("class : " + f.getDeclaringClass());
         
         //3) 필드 타입 가져오기
         System.out.println("type : " + f.getType());
         
         //4) 필드의 접근제한자 가져오기 (int 형이며 Modifier.toString(mod) 로 string으로 바꿔줄 수 있음)
         int modifiers = f.getModifiers();
         System.out.println("modifiers int : " + modifiers);
         System.out.println("modifiers toString : " + Modifier.toString(modifiers));
         System.out.println("isPublic? : " + (modifiers == Modifier.PUBLIC));
         
         System.out.println();
      }
   }
}
