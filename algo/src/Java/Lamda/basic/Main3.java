package Java.Lamda.basic;

public class Main3 {
	
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
	}
	
	class Calculator {
		Integer add(Calculation cal, Integer x, Integer y) {
			return cal.apply(x, y);
		}
	}
	
	
	
	
}
