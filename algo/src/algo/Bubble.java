package algo;

public class Bubble {
	public static void main(String[] args) {
		int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
		int b;
		for(int i = 0 ; i < a.length-1 ; i ++) {
			for(int j = 0 ; j < a.length -i -1 ; j ++) {
				if(a[j]<a[j+1]) {
					b = a[j];
					a[j] = a[j+1];
					a[j+1] = b;
				}
			}
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(a[i]+" ");
		}
		//3410 342 324 254 213 78 76 76 75 65 64 56 9 8 5 4 3 
		//3410 342 324 254 213 78 76 76 75 65 64 56 9 8 5 4 3 
	}

}
