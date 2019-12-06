package algo_datastructure.sort.quicksort;

public class QuickSort {
	
//	public static void main(String[] args) {
//		int arr[] = {1, 8, 6, 2, 4, 3, 5, 7};
//		
//	}
	
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
	        
	        if(l < right) sort(data, l, right);
	        if(r > left) sort(data, left, r);
	    }
	  
	  	//출처: https://hahahoho5915.tistory.com/9 [넌 잘하고 있어]
	    public static void main(String[] args) {
	        
	        int data[] = {8, 5, 2, 1, 3, 4, 7, 6};
	        
	        QuickSort quick = new QuickSort();
	        quick.sort(data, 0, data.length - 1);
	        for(int i=0; i<data.length; i++){
	            System.out.print(data[i]+ " ");
	        }
	    }


	
	
}
