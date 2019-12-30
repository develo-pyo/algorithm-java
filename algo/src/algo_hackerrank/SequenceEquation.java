package algo_hackerrank;

public class SequenceEquation {
	
	//Hackerrank Sequence Equation easy
	public static void main(String[] args) {
		int[] param = {5,2,1,3,4};
		int[] result = permutationEquation(param);
		for(int i : result) {
			System.out.println(i);
		}
	}

	private static int[] permutationEquation(int[] p) {
		int length = p.length;
		int[] result = new int[length];
		int[] tmp = new int[length];
		
		for(int i=1; i<=length; i++) {
			for(int j=0; j<length; j++) {
				if(i == p[j]) {
					tmp[i-1] = j+1;
					break;
				}
			}
		}
		
//		for(int i : tmp) {
//			System.out.println(i);
//		}
		
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				if(tmp[i] == p[j]) {
					result[i] = j+1;
				}
			}
		}
		
		
		return result;
	}
	
}