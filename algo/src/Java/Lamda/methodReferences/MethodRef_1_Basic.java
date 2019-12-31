package Java.Lamda.methodReferences;

public class MethodRef_1_Basic {
	/**
	 * 2
	 * 람다의 메소드 참조
	 * 메소드 참조는 매개변수의 정보 및 리턴 타입을 알아내어 람다식에 불필요한 매개 변수를 제거하기 위함
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 1.기본 사용법 */
		//String.valueOf() 를 그대로 사용하여 리턴하는 람다
		FuncI funcI = (Object obj) -> String.valueOf(obj);
		System.out.println(funcI.anony("HELLO"));
		
		//위 경우 아래와 같이 메소드 참조가 가능 1
		FuncI funcI_ref_method = String::valueOf;
		System.out.println(funcI_ref_method.anony(100));
		
		//위 경우 아래와 같이 메소드 참조가 가능 2
		System.out.println(convert(99, String::valueOf));
		
		
		//static 인 경우, 클래스::메소드;
		//인스턴스 메소드인 경우, 참조변수::메소드;
		FuncI2 funcI2 = Math::max;	//FuncI2 함수형 인터페이스를 Math.max 참조시키도록
		System.out.println(funcI2.anony(1, 2));
		
		FuncI3 funcI3 = MethodRef_1_Basic::sample;
		System.out.println(funcI3.anony('a'));
		
		
		/** 2. 생성자 참조 */
		
		
		
		
		/** 3. 스태틱 메소드 참조 */
		/** 4. 인스턴스 메소드 참조 */
		/** 5. 인스턴스 메소드 참조 */
	}

	@FunctionalInterface
	interface FuncI {
		String anony(Object obj);
	}
	
	public static String convert(Integer number, FuncI func) {
		return func.anony(number);
	}
	
	@FunctionalInterface
	interface FuncI2 {
		int anony(int a, int b);
	}
	
	@FunctionalInterface
	interface FuncI3 {
		int anony(Character c);
	}
	
	static int sample(Character c) {
		return (int)c;
	}
}
