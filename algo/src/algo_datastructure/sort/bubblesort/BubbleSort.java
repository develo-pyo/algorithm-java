package algo_datastructure.sort.bubblesort;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 6, 4, 3, 5, 2};
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
}
