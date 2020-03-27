package algo_datastructure.algo.programmers_top;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		int[] input = {6,9,5,7,4};
		
		int[] res = s.solution(input);
		
		System.out.println("=======result===========");
		for(int i:res) {
			System.out.print(i + " ");
		}
	}

}
