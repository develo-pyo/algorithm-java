package algo_hackerrank;

public class SaveThePrisoner {
	
	public static void main(String[] args) {
		
		solution(5, 2, 1);	//2
		// 1 2 
		
		solution(7, 19, 2);	//2
		//   1 2 3 4 5 6
		// 7 8 9 1 1 2 3  
		// 4 5 6 7 8 9
		
		solution(3, 7, 3);	//3
		//     3
		// 4 5 6
		// 7 8 9
		
		solution(3, 8, 3);	//
		//     3
		// 4 5 6
		// 7 8 9
		// 1

	}
	
	public static int solution(int n, int m, int s) {
		int result = 0;
		result = (m + s - 1) % n;
		
		if(result == 0) {
			result = n;
		}
		
		return result;
	}
	
}
