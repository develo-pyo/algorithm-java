package algo_datastructure.sort.bubblesort;

public class BubbleSort {
	
	//시간복잡도 
	// BEST  n^2
	// AVG   n^2
	// WORST n^2
	
	private static int[] arr = {5, 4, 7, 2, 3, 1, 6};
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				print();
				System.out.println();
			}
			System.out.println();
		}
		print();
	}
	

	private static void print() {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
}
