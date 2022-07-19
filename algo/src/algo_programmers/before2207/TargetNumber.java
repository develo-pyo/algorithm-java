package algo_programmers.before2207;

public class TargetNumber {
	//프로그래머스 > 코딩테스트연습 > 깊이/너비 우선참색(DFS/BFS) > 타겟 넘버
//	n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 
//	예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
	
//	DFS : Depth-First Search 깊이 우선 탐색 알고리즘
//	https://gmlwjd9405.github.io/2018/08/14/algorithm-dfs.html
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int rs = solution(numbers, target);
		System.out.println("rs:"+rs);
	}

	private static int solution(int[] numbers, int target) {
		int answer = 0;
		
		answer = dfs(numbers, 0, 0, target);
		
		return answer;
	}
	
	private static int dfs(int[] numbers, int node, int sum, int target){
        
//		node 	       1  2  3  4  5
//		sum            1  2  3  4  5  
//		number length  5  
//		target         3
		
		if(node == numbers.length){
            if(sum==target) {
                return 1;
            }
            return 0;
        }
//		System.out.println("> " + (sum+numbers[node])+ "," +(node+1));
        return dfs(numbers, node+1, sum + numbers[node], target) 
        	 + dfs(numbers, node+1, sum - numbers[node], target);
    }
}
