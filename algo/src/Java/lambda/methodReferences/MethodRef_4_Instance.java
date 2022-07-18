package Java.lambda.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodRef_4_Instance {
	/**
	 * 2
	 * 람다의 메소드 참조
	 * 메소드 참조는 매개변수의 정보 및 리턴 타입을 알아내어 람다식에 불필요한 매개 변수를 제거하기 위함
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 4. 인스턴스 메소드 참조 */
		Person person = new Person("pyo");
		Func func = person::getName;
		System.out.println(func.anony());
		
	}
	
	@FunctionalInterface
	interface Func {
		String anony();
	}
}
