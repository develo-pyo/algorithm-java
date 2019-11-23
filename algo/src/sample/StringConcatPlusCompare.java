package sample;

public class StringConcatPlusCompare {
	
	public static void main(String[] args) {
		
		String origin = "";
		String text = null;
		
		System.out.println(plusOperatorTest("from", "to"));
		System.out.println(concatTest("from", "to"));
		
		System.out.println(plusOperatorTest("from", text));
		
		System.out.println(concatTest("from", null));
	}
	
	public static String concatTest(String a, String b) {
		return a.concat(b);
	}
	
	public static String plusOperatorTest(String a, String b) {
		return "" + a + b;
	}
	
}
