package algo_hackerrank;

public class RunningTimeOfAlgorithm {
	
	//hackerrank easy, Running Time of Algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 4, 2, 3};
		int rs = runningTime(arr);
		System.out.println(rs);
	}

	static int runningTime(int[] arr) {
        int rs = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    rs++;
                }
            }
        }

        return rs;
    }
}
