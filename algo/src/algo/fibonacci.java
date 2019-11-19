package algo;

public class fibonacci {
	
	public static void main(String[] args) {
		System.out.println(recursionFibonacci(3));
	}
	
	private static int fibonacci(int n) {
		// a b c
		//   a b c
		//     a b c
		// 0 1 1 2 3 5 8
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		if(n<2) return n;
		
		for(int i=2; i<=n; i++) {
			c = a + b;
			
			a = b;
			b = c;
		}
		
		return c;
	}

	private static int recursionFibonacci(int n) {
		
		if(n < 2) {
			return n;
		} else if (n == 2){
			return 1;
		} else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
		
	}

	
}


