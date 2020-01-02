package Java.Lamda.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodRef_4_Instance {
	/**
	 * 2
	 * ������ �޼ҵ� ����
	 * �޼ҵ� ������ �Ű������� ���� �� ���� Ÿ���� �˾Ƴ��� ���ٽĿ� ���ʿ��� �Ű� ������ �����ϱ� ����
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 4. �ν��Ͻ� �޼ҵ� ���� */
		Person person = new Person();
		Func func = person::getName;
		System.out.println(func.toStr());
		
	}
	
	@FunctionalInterface
	interface Func {
		String toStr();
	}
}