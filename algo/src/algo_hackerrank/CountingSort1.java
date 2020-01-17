package algo_hackerrank;

public class CountingSort1 {
	
	//hackerrank easy : counting sort 1
    public static void main(String[] args) {
    	int[] arr = {1, 1, 3, 2, 1};
    	int[] rs = countingSort(arr);
    	for(int i:rs) {
    		System.out.print(i+" ");
    	}
    }
    
    static int[] countingSort(int[] arr) {
    	int[] result = new int[100];
    	
    	for(int i=0; i<100; i++) {
	    	for(int j=0; j<arr.length; j++) {
	    		if(i==arr[j]) {
	    			result[i]++;
	    		}
	    	}
    	}
    	
    	return result;
    }
}
