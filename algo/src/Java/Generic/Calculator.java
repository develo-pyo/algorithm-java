package Java.Generic;

public class Calculator {
	public static <T extends Food> int add1(Cart<T> cart1, Cart<T> cart2, Cart<T> cart3) {
		//���׸� �޼ҵ忡���� Ÿ�� �Ķ������ ����
		//Ÿ���Ķ���͸� Food �� ����
		//�Ű������� Ÿ���Ķ������ T�� ���� Cart�̸�, T�� Food �� Food �� subclass �� ����
		int result = 0;
		result = cart1.getItems().size() + cart2.getItems().size() + cart3.getItems().size();
		return result;
	}
	
//	public static <T super Food> int add2(Cart<T> cart1, Cart<T> cart2, Cart<T> cart3) {	
//		//���׸� �޼ҵ忡�� Ÿ�� �Ķ���͸� ������ �� ���� ���� superŰ����� �Ұ� 
//		//compile error
//		int result = 0;
//		result = cart1.getItems().size() + cart2.getItems().size() + cart3.getItems().size();
//		return result;
//	}
	
	public static int add3(Cart<? super Food> cart1, Cart<?> cart2, Cart<? extends Food> cart3) {
		//�Ű������� Ÿ���� ���ϵ�ī�� (?)�� ����Ͽ� ����
		//cart1 �ƴ뺯��(Cart)�� Ÿ���Ķ���� : Food �� Food �� subclass 
		//cart2 �Ű�����(Cart)�� Ÿ���Ķ���� : �ƹ� Ÿ���̳� ����ִ� Cart
		//cart3 �Ű�����(Cart)�� Ÿ���Ķ���� : Food �� Food �� subclass
		int result = 0;
		result = cart1.getItems().size() + cart2.getItems().size() + cart3.getItems().size();
		return result;
	}
	
	public static <T extends Food> int add4(Cart<T> cart1, Cart<T> cart2) {
		//���׸� �޼ҵ忡���� Ÿ�� �Ķ������ ����
		//Ÿ���Ķ���͸� Food �� ����
		//�Ű������� Ÿ���Ķ������ T�� ���� Cart�̸�, T�� Food �� Food �� subclass �� ����
		int result = 0;
		result = cart1.getItems().size() + cart2.getItems().size();
		return result;
	}
}
