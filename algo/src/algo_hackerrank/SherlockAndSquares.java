package algo_hackerrank;

public class SherlockAndSquares {

	public static void main(String[] args) {
		int r = solution(17, 24);
		System.out.print("result : " + r);
	}
	
	public static int solution(int a, int b) {
		int result = 0;
		
		int l = (int)Math.sqrt(b);
		System.out.println("last : " + b);
		
		int tmp = 0;
		do {
			tmp = l*l;
			System.out.println(tmp);
			if(tmp >= a && tmp <= b) {
				result++;
				l--;
			} else {
				break;
			}
		}while(true);
		
		
		return result;
	}
	
	
}
