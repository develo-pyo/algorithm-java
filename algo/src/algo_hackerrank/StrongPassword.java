package algo_hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
	
//	public static void main(String[] args) {
//		
//		String input = "Ad";
//		
////		String numbers = "0123456789";
////		String lower_case = "abcdefghijklmnopqrstuvwxyz";
////		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
////		String special_characters = "!@#$%^&*()-+";
//		
//		int needs = 0;
//		
//		Pattern p = Pattern.compile("[0-9]");
//		
//		Matcher m = p.matcher(input);
//		if(!m.find()) {
//			System.out.println("no");
//			needs++;
//		}
//		
//		Pattern p1 = Pattern.compile("[a-z]");
//		m = p1.matcher(input);
//		if(!m.find()) {
//			System.out.println("lower ");
//			needs++;
//		}
//		
//		Pattern p2 = Pattern.compile("[A-Z]");
//		m = p2.matcher(input);
//		if(!m.find()) {
//			System.out.println("capital");
//			needs++;
//		}
//		
//		Pattern p3 = Pattern.compile("[!@#$%^&*()\\-+]");
//		m = p3.matcher(input);
//		if(!m.find()) {
//			System.out.println("special");
//			needs++;
//		}
//		
//		System.out.println("needs:"+needs);
//		
//		
//		if(6 > input.length()+needs) {
//			needs = 6-input.length();
//		}
//		
//		System.out.println(needs);
//	}
	
	public static void main(String[] args) {
		
		String input = "12";
		System.out.println(Pattern.matches("[0-9]+", input));
		
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(input);
		System.out.println(m.find());
		
	}
}
