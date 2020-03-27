package algo_datastructure.sort.quicksort;

public class QuickSort {
		
	// 시간복잡도 
	// BEST  nlogn
	// AVG   nlogn
	// WORST n^2
	
	//출처: https://hahahoho5915.tistory.com/9 [넌 잘하고 있어]
	
	private static int data[] = {8, 5, 2, 1, 3, 4, 7, 6};
	
	public void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        print();
        System.out.println();
        
        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }
  
    public static void main(String[] args) {
        QuickSort quick = new QuickSort();
        quick.sort(data, 0, data.length - 1);
        print();
    }
    
    private static void print() {
		for(int i:data) {
			System.out.print(i+" ");
		}
	}
	
}
