package Java.Generic;

public class Calculator {
	public static <T extends Food> int add1(Cart<T> cart1, Cart<T> cart2, Cart<T> cart3) {
	   //제네릭 메소드에서의 타입 파라미터의 제한
      //타입파라미터를 Food 로 제한
      //매개변수는 타입파라미터인 T를 갖는 Cart이며, T는 Food 및 Food 의 subclass 로 제한
	   int result = 0;
		result = cart1.getItems().size() + cart2.getItems().size() + cart3.getItems().size();
		return result;
	}
	
//	public static <T super Food> int add2(Cart<T> cart1, Cart<T> cart2, Cart<T> cart3) {	
//	   //제네릭 메소드에서 타입 파라미터를 제한할 때 위와 같은 super키워드는 불가 
//		//compile error
//		int result = 0;
//		result = cart1.getItems().size() + cart2.getItems().size() + cart3.getItems().size();
//		return result;
//	}
	
	public static int add3(Cart<? super Food> cart1, Cart<?> cart2, Cart<? extends Food> cart3) {
	   //매개변수의 타입을 와일드카드 (?)를 사용하여 제한
      //cart1 맥대변수(Cart)의 타입파라미터 : Food 및 Food 를 subclass 
      //cart2 매개변수(Cart)의 타입파라미터 : 아무 타입이나 담고있는 Cart
      //cart3 매개변수(Cart)의 타입파라미터 : Food 및 Food 의 subclass
		int result = 0;
		result = cart1.getItems().size() + cart2.getItems().size() + cart3.getItems().size();
		return result;
	}
	
	public static <T extends Food> int add4(Cart<T> cart1, Cart<T> cart2) {
		int result = 0;
		result = cart1.getItems().size() + cart2.getItems().size();
		return result;
	}
}
