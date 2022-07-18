package algo_hackerrank;

public class LisasWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 2, 6, 1, 10};
		System.out.println(workbook(5, 3, arr));
	}
	
	static int workbook(int n, int k, int[] arr) {
		int result = 0;
		
		int page = 1;
		
		for(int i=0; i<arr.length; i++) {
			int problems = arr[i];
			
			for(int problem=1; problem <=problems; problem++) {
				if(problem == page) {
					//페이지와 문항번호가 일치하면 결과++
					result++;
				}
				if(problem % k == 0 || problem==problems) {
					//문항번호가 최대 갯수에 도달하면 페이지++
					//문항번호가 마지막 문항번호인 경우 페이지++
					page++;
				}
			}
		}
		
		return result;
    }

}
