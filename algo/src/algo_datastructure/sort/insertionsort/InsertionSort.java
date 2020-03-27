package algo_datastructure.sort.insertionsort;

public class InsertionSort {
	
	//시간복잡도 
	// BEST  n
	// AVG   n^2
	// WORST n^2
	
	private static int[] arr = {6, 2, 4, 1, 3, 5};
	public static void main(String[] args) {
		
		int key = -1;
		int j = -1;
		
		for(int i=1; i<arr.length; i++) {
			key = arr[i];
			j=i;
			while(j > 0 && key < arr[j-1]) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = key;
			print();
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
