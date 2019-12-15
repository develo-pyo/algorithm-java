package algo_hackerrank;

public class HackerrankInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solu("hereiamstackerrank"));
	}
	
	private static String solu(String input) {
		String result = "NO";
		
		String hackerrank = "hackerrank";
		int tmp = 0;
		
		for(int j=0; j<hackerrank.length(); j++) {
			for(int i=0; i<input.length(); i++) {
				if(hackerrank.charAt(j) == input.charAt(i)) {
					tmp++;
					
					input = input.substring(i+1);
					System.out.println("input:"+input);
					System.out.println("hackerrank:"+hackerrank);
					System.out.println();
					break;
				}
			}
			if(hackerrank.length() == tmp)return "YES";
		}
		
		return result;
	}
	
	
}
