package algo_hackerrank;

public class Pangrams {
	
	//hackerrank pangrams easy
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solu("The quick brown fox jumps over the lazy dog"));
	}

	private static String solu(String input) {
		String result = "not pangram";
		
		Character[] arr = new Character[26];
		int j=0;
		for(int i=97; i<123; i++) {
			arr[j] = (char)i;
			j++;
//			System.out.print((char)i+" ");
		}
		
		String s = input.toLowerCase();
		int rs = 0;
		for(Character c : arr) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == c) {
					rs++;
					break;
				}
			}
		}
		if(rs == arr.length) {
			result = "pangram";
		}
		
		return result;
	}
	
	
}
