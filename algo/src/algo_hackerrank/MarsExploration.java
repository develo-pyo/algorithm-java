package algo_hackerrank;

public class MarsExploration {

	public static void main(String[] args) {
		System.out.println(solu2("SOSSPSSQSSOR"));
	}
	
	private static int solu(String s) {
		int result = 0;
		for(int i=0; i<s.length()-2; i=i+3) {
			if(s.charAt(i) != 'S')result++; 
			if(s.charAt(i+1) != 'O')result++;
			if(s.charAt(i+2) != 'S')result++;
		}
		
		return result;
	}
	
	private static int solu2(String s) {
		int result = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != "SOS".charAt(i%3))result++;
		}
		
		return result;
	}
}
