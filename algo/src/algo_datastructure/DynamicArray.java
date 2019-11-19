package algo_datastructure;

public class DynamicArray {
	
	public static void main(String args[]) {
//		
//		int[] arr = {1, 2, 3, 4, 5};
//		int l = arr.length;
//		int move = 3;
//		int m = (int)l%move;
//		
//		int[] r = new int[l];
//		
////		l 5 5 5 5 5
////		m 2 2 2 2 2
////		i 0 1 2 3 4
////		  3 4 5 6 7 (l-m+i) 
////		  3 4 0 1 2 (l-m+i)%l
////		r 3 4 0 1 2
//		
//		for(int i=0; i<l; i++) {
//			r[i] = arr[(l-m+i)%l];
//			System.out.print(r[i]);
//		}
//		
		
		int[] arr = new int[3];
		arr[1] = 4;
		arr[2] = 5;
		arr[0] = 2;
		
		for(int i:arr) {
			System.out.println(i + " ");
		}
		
	}
}
