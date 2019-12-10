package algo_hackerrank;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Factorial_bigInteger {
	// Complete the happyLadybugs function below.
	public static void main(String[] args) {
		sample("RBY_YBR");
    }

	public static String sample(String b) {

        String result = "YES";
        
        String without_ = b;
        without_ = without_.replaceAll("_", "");
        
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<without_.length(); i++){
            set.add(without_.charAt(i));
        }

        if(b.indexOf("_") > -1) {
            for(Character s : set){
              if(b.length() - b.replaceAll(Character.toString(s), "").length() == 1){
                System.out.println("case1");
                return "NO";
              }
            }
        } else {
            for(int j=1; j<b.length(); j++){
                if(b.charAt(j-1) != b.charAt(j) && b.charAt(j+1) != b.charAt(j)){
                    System.out.println("case2");
                    return "NO";
                }
            }
        }
        
        return result;
	}
   


}