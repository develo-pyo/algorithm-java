package algo_hackerrank;

import java.util.Stack;

public class HackerrankInAString {
	//hackerrank in a String! : easy
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solu("hereiamstackerrank"));
	}
	
	private static String solu(String input) {
		String result = "NO";
		
		String hackerrank = "hackerrank";
		int tmp = 0;
		
		for(int j=0; j<hackerrank.length(); j++) {
			int b = 0;
			for(int i=0; i<input.length(); i++) {
				if(hackerrank.charAt(j) == input.charAt(i)) {
					tmp++;
					b++;
					input = input.substring(i+1);
					System.out.println("input:"+input);
					System.out.println("hackerrank:"+hackerrank);
					System.out.println();
					break;
				}
			}
			if(hackerrank.length() == tmp) {
				return "YES";
			} 
			if(b == 0) {
				return "NO";
			}
		}
		
		return result;
	}
	
	//using Stack
	static String solu2(String s) {
        // Complete this function
        Stack<Character> stack= new Stack<>();
        stack.push('k');
        stack.push('n');
        stack.push('a');
        stack.push('r');
        stack.push('r');
        stack.push('e');
        stack.push('k');
        stack.push('c');
        stack.push('a');
        stack.push('h');
        
        String result="NO";
        for(Character c:s.toCharArray()){
            if(c==stack.peek())
                stack.pop();
            if(stack.isEmpty()){
                result="YES";
                break;
            } 
        }
        return result;
    }
	
}
