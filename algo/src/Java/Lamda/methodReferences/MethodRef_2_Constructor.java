package Java.Lamda.methodReferences;

import java.util.ArrayList;
import java.util.List;

public class MethodRef_2_Constructor {
	/**
	 * 2
	 * 람다의 메소드 참조
	 * 메소드 참조는 매개변수의 정보 및 리턴 타입을 알아내어 람다식에 불필요한 매개 변수를 제거하기 위함
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 2. 생성자 참조 */
//		String::new 는
//		() -> new String() 과 같음
		
		Sample s = new MethodRef_2_Constructor().new Sample();
		List<Object> list = new ArrayList<Object>();
		s.initialize(list, String::new);	//생성자 메소드를 참조.. new String()
		
		
		
		
		Factory<Person> factory = () -> new Person("pyo");
		
		Sample sample = new MethodRef_2_Constructor().new Sample();
		List<Person> personList = new ArrayList<Person>();
		sample.initialize(personList, factory);
		
		System.out.println(personList.get(0).getName());
		
	}
	
	
	@FunctionalInterface
	interface Factory<T> {
		T create();
	}
	
	class Sample{
		public <T> void initialize(List<T> list, Factory<T> factory) {
			list.add(factory.create());
		}
	}
}
