package algo_hackerrank;

import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {

	public static void main(String[] args) {
		
		int[] arr = {4, 4, 3, 6, 2, 4};
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
            if(m.containsKey(arr[i])){
                int tmp = m.get(arr[i]);
                m.put(arr[i], tmp+1);
            } else {
            	m.put(arr[i], 1);
            }
        }
        
        int max = 0;
        for(int key : m.keySet()) {
        	if(max < m.get(key)) {
        		max = m.get(key);
        	}
        }
        
        int rs = arr.length-max;
        
	}

}
