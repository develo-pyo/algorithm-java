package algo_hackerrank;

public class BeautifulBinaryString {
	
	//hackerrank easy : beautiful binary String
	public static void main(String[] args) {
		System.out.println(solu("0101010"));
	}
	
	private static int solu(String input) {
		int result = 0;
		
		result = input.length() - input.replaceAll("010", "").length();
		
		result /= 3;
		
		return result;
	}
	

}
