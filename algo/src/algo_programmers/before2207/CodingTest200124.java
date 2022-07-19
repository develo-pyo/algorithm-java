package algo_programmers.before2207;

public class CodingTest200124 {

    public static void main(String[] args) {
		String encrypted_text = "bd";
		String key = "ab";
		int rotation = 0;
		String encTextBeforeRotated = getEncTextBeforeRotated(encrypted_text, rotation%key.length());
		String result = getDecryptedText(encTextBeforeRotated, key);
		System.out.println(result);
    }
    
    private static String getEncTextBeforeRotated(String encText, int rot) {

		if(rot == 0) {
			return encText;
		}
		
		StringBuffer result = new StringBuffer();
		String extra = "";
		String remainText = "";
		
		if(rot > 0) {
			extra = encText.substring(0, rot);
			remainText = encText.substring(rot, encText.length());
			result.append(remainText).append(extra);
		} else if (rot < 0){
			extra = encText.substring(encText.length()+rot, encText.length());
			remainText = encText.substring(0, encText.length()+rot);
			result.append(extra).append(remainText);
		}
		
		return result.toString();
	}
    
    
	private static String getDecryptedText(String encText, String key) {
		String result = "";
		for(int i=0; i<encText.length(); i++) {
			
			int gap = encText.charAt(i)-key.charAt(i);
			char tmp = 0;
			if(gap > 0) {
				tmp = (char) (gap + 96);
			} else {
				tmp = (char) ('z'+gap);
			}
			result += tmp;
		}
		
		return result;
	}
}
