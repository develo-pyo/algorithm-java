package algo_hackerrank;

import java.math.BigInteger;

public class LadyBugs {
	// Complete the happyLadybugs function below.
	public static void main(String[] args) {
		
		
		System.out.println(f(new BigInteger("3")));
		
    }

	 public static BigInteger f(BigInteger n){
		 
        if(n.compareTo(new BigInteger("0"))  == -1) {
            return new BigInteger("-1");
        } else if(n.compareTo(new BigInteger("0")) == 0) {
            return new BigInteger("1");   
        } else {
            return (BigInteger) n.multiply(f(n.subtract(new BigInteger("1"))));
        }
        
        
    }

}