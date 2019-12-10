package algo_hackerrank;

public class FairRations {
	
	//hackerrank , Fair Rations , Easy, 90%, https://www.hackerrank.com/challenges/fair-rations/problem
	public static void main(String[] args) {
		int[] people = {1, 4, 4, 1};
		int cnt = 0;
		
		// 1 2 2 1
		// 2 3 2 1
		// 2 4 3 1
		// 2 4 4 2
		
		// 1 1 2 2
		// 2 2 2 2
		
		
		// 1 2 2 1 1 2 2 1
		// 2 3 2 1 1 2 2 1
		// 2 4 3 1 1 2 2 1
		// 2 4 4 2 1 2 2 1
		// 2 4 4 2 2 3 2 1
		// 2 4 4 2 2 4 3 1
		// 2 4 4 2 2 4 4 2
		
		// 1 2 2 2 1
		// 2 3 2 2 1
		// 2 4 3 2 1
		// 2 4 4 3 1
		// 2 4 4 4 2
		
		int bread = 0;
		int start = 0;
		for(int i=0; i<people.length; i++) {
			
			if(isOdd(people[i])) {
				cnt++;
				if(isOdd(cnt)) {
					start = i;
				} else {
					bread += i - start;
				}
			}
		}
		
		if(isOdd(cnt)) {
			System.out.println("NO");
		} else {
			System.out.println(bread*2);
		}
	}
	
	public static boolean isOdd(int n) {
		boolean result = false;
		if(n%2 != 0) {
			return true;
		}
		return result;
	}
}
