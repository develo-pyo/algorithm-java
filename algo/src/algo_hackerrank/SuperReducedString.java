package algo_hackerrank;

public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solu("aaabccddd"));
	}
	
	private static String solu(String input) {
		String str=input;
		
		int cnt = 1;
		
		while(cnt>0) {
			cnt = 0;
			for(int i=1; i<str.length(); i++) {
				if(str.charAt(i-1) == str.charAt(i)) {
					str = str.substring(0, i-1)+str.substring(i+1, str.length());
					System.out.println(str);
					cnt++;
				}
			}
		}
		return str.isEmpty()?"Empty String":str;
	}
	
}
