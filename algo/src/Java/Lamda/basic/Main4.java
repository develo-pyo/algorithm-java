package Java.Lamda.basic;

import java.util.Arrays;
import java.util.Comparator;

public class Main4 {
	
	//java lamda
	//jdk 1.8~
	//함수형 프로그래밍
	//인터페이스 + 익명객체 + 람다식
	//1회용 익명 메소드가 필요할 때 람다를 사용 
	
	//참고 https://futurecreator.github.io/2018/07/20/java-lambda-type-inference-functional-interface/
	public static void main(String[] args) {
		
		Calculation add = (x, y) -> {
			return x+y;
		};
		add.print(2, 3);
		Calculation.print2(2, 3);
		System.out.println(calculate(add, 2, 3));
		
		
		Calculation multiply = (x, y) -> x*y;
		System.out.println(calculate(multiply, 2, 3));
		
	}
	
	static Integer calculate(Calculation operation, Integer x, Integer y) {
		return operation.apply(x, y);
	}
	
	//@FunctionalInterface 는 abstract method 가 오직 1개여야 한다.
	@FunctionalInterface
	interface Calculation {
		Integer apply(Integer x, Integer y);
		
		//default 메소드는 예외 (인터페이스도 추상 메소드가 아닌 메소드를 가질 수 있다니..)
		default void print(Integer x, Integer y) {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
		}
		
		//static 메소드는 예외 (인터페이스도 추상 메소드가 아닌 메소드를 가질 수 있다니..)
		static void print2(Integer x, Integer y) {
			System.out.println("x : " + x + ", y : " + y);
		}
		
		//Comparator interface 도 내부적으로 compare 만 추상메소드일 뿐, 나머지 메소드들은 전부 default 및 static 메소드이다.
		//1.7 이하에서의 Comparator 에선 애초에 추상 메소드만 존재(1.7 이하엔 인터페이스에서 default 메소드, static 메소드 자체가 허용되지 않음)
		//1.8 에서의 Comparator 는 default 메소드 및 static 메소드 다수 존재 but 추상메소드는 단 한 개( compare() ) 
	}
	
	class Calculator {
		Integer add(Calculation cal, Integer x, Integer y) {
			return cal.apply(x, y);
		}
	}
	
}
