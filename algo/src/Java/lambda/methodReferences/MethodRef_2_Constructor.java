package Java.lambda.methodReferences;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

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
		
//		Sample s = new MethodRef_2_Constructor().new Sample();
//		List<Object> list = new ArrayList<Object>();
//		s.initialize(list, String::new);	//생성자 메소드를 참조.. new String()
//		
//		
//		Factory<Person> factory = () -> new Person("pyo");
//		
//		Sample sample = new MethodRef_2_Constructor().new Sample();
//		List<Person> personList = new ArrayList<Person>();
//		sample.initialize(personList, factory);
//		
//		System.out.println(personList.get(0).getName());
		
		Func<String, Person> func1 = Person::new;
		Person person = func1.create("pyo");
		System.out.println(person.getName());
		
		Func2<String, String, Person> func2 = Person::new;
		Person person2 = func2.create("pyo", "male");
		System.out.println(person2.getName() + "/" + person2.getGender());
	}
	
	@FunctionalInterface
	interface Func<T, R>{
		R create(T t);
	}
	@FunctionalInterface
	interface Func2<T, U, R>{
		R create(T t, U u);
	}
	
	@FunctionalInterface
	interface Factory<T> {
		T create();
	}
	
	class Sample{
		public void initialize(List list, Factory factory) {
			list.add(factory.create());
		}
	}
}
