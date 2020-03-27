package Java.lambda.basic;

public class Main2 {
	
	//java lamda
	//jdk 1.8~
	//함수형 프로그래밍
	//인터페이스 + 익명객체 + 람다식
	//1회용 익명 메소드가 필요할 때 람다를 사용 
	
	//참고 https://futurecreator.github.io/2018/07/20/java-lambda-type-inference-functional-interface/
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		Calculation add = new Calculation() {
			@Override
			public Integer apply(Integer x, Integer y) {
				return x+y;
			}
		};
		System.out.println(cal.calculate(add));
		
		
		Calculation multiply = (x, y) -> {
			return x * y;
		};
		System.out.println(cal.calculate(multiply));
	}
	
	//@FunctionalInterface 는 abstract method 가 오직 1개여야 한다.
	@FunctionalInterface
	interface Calculation {
		Integer apply(Integer x, Integer y);
	}
	
	static class Calculator {
		Integer calculate(Calculation cal) {
			return cal.apply(2, 3);
		}
	}
	
	
}
