package algo_hackerrank;

public class JumpingOntheClouds {
	
	//hackerrank : Jumping On The Clouds : easy
	public static void main(String[] args) {
		
//		int arr[] = {0, 0, 1, 0, 0, 1, 0};
//		int arr[] = {0, 0, 0, 0, 1, 0};
		int arr[] = {0, 1, 0, 0, 0, 1, 0};
		
		int r = jumpingOnClouds(arr);
		System.out.println("result : "+r);
		
	}
	
	static int jumpingOnClouds(int[] c) {
		int result = 0;
		
		for(int i=0; i<c.length-1; i++) {
			if(c[i+1] == 0) {
				result++;
				if(i+2 < c.length && c[i+2] == 0) {
					i++;
				} else {
					//c[i+2] == 1
				}
			} else {
				//c[i+1] == 1
				result++;
				i++;
			}
		}
		
		return result;
	}
}
