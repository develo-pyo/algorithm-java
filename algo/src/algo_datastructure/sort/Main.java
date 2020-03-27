package algo_datastructure.sort;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 2, 4, 3};
		int cnt = 0;
		// 0 
		// 0 1
		// 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
