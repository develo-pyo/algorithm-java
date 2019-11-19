package algo_datastructure;

public class TWOD_array {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				  {0, 1, 2, 3}
				, {0, 1, 2, 3} 
				, {0, 1, 2, 3} 
				, {0, 1, 2, 3} 
		};
		
		int row = arr.length;
		int col = arr[0].length;
		
		int biggest = -100;
        
        for(int i=0; i<row-2; i++) {
            for(int j=0; j<col-2; j++) {
                int tmp = arr[i][j] + arr[i][j+1]   + arr[i][j+2]
                                    + arr[i+1][j+1] + 
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
                
                if(biggest < tmp)biggest=tmp;
            }
        }
        
        System.out.println(biggest);
	    
	}

}
