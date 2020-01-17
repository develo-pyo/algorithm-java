package Java.lambda.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodRef_3_Static {
	/**
	 * 2
	 * 람다의 메소드 참조
	 * 메소드 참조는 매개변수의 정보 및 리턴 타입을 알아내어 람다식에 불필요한 매개 변수를 제거하기 위함
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 3. 스태틱 메소드 참조 */
//		특정 스태틱 메소드 직접 잠조 가능
		Integer[] arr = {1, 5, 2, 4, 3};
		
		
		//기존 jdk 1.7 이하
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		//람다식 사용 jdk 1.8 이상
		Arrays.sort(arr, (x, y) -> x-y);
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
		FuncI func = MethodRef_3_Static::toStr;
		System.out.println(func.anony("HELLO LAMBDA!"));
	}
	
	static String toStr(String str) {
		return str.toString();
	}
	
	@FunctionalInterface
	interface FuncI {
		String anony(String str);
	}
	
}
