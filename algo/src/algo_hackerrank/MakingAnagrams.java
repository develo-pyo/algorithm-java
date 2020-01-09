package algo_hackerrank;

public class MakingAnagrams {
	
	//hackerrank / Making Anagrams / easy
	public static void main(String[] args) {
		
		// aabc     abd   
		// 
		
		int result = makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa");
		System.out.println("res : " + result);
	}

	//b bdc 1
	//. dc  1
	//

	private static int makingAnagrams(String s1, String s2) {
		int result = 0;
		while(s1.length()>0) {
			String letter = String.valueOf(s1.charAt(0));
			
			int s1BeforeLength = s1.length();
			int s2BeforeLength = s2.length();
			
			String s1replaced = s1.replaceAll(letter, "");
			String s2replaced = s2.replaceAll(letter, "");
			
			int s1AfterLength = s1replaced.length();
			int s2AfterLength = s2replaced.length();
			
			s1=s1replaced;
			s2=s2replaced;

			int removedCharCnt1 = s1BeforeLength - s1AfterLength;
			int removedCharCnt2 = s2BeforeLength - s2AfterLength;

			System.out.println("r1:"+removedCharCnt1+",   r2:"+removedCharCnt2);
			if(removedCharCnt1 != removedCharCnt2) {
				result += Math.abs(removedCharCnt1 - removedCharCnt2);
			}
		}
		while(s2.length()>0) {
			String letter = String.valueOf(s2.charAt(0));
			
			int s1BeforeLength = s1.length();
			int s2BeforeLength = s2.length();
			
			String s1replaced = s1.replaceAll(letter, "");
			String s2replaced = s2.replaceAll(letter, "");
			
			int s1AfterLength = s1replaced.length();
			int s2AfterLength = s2replaced.length();
			
			s1=s1replaced;
			s2=s2replaced;

			int removedCharCnt1 = s1BeforeLength - s1AfterLength;
			int removedCharCnt2 = s2BeforeLength - s2AfterLength;

			System.out.println("r1:"+removedCharCnt1+",   r2:"+removedCharCnt2);
			if(removedCharCnt1 != removedCharCnt2) {
				result += Math.abs(removedCharCnt1 - removedCharCnt2);
			}
		}
		return result;
	}
}
