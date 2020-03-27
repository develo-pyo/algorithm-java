package algo_hackerrank;

import java.math.BigInteger;
import java.util.Arrays;

public class BiggerIsGreater {
	// Complete the happyLadybugs function below.
	public static void main(String[] args) {
		
		  String[] words = { "가나다", "라마바", "라가다", "라다나", "아자차" };
	      int n = words.length;

	      for(int i = 0; i < n-1; ++i) {
	         for (int j = i + 1; j < n; ++j) {
	            if (words[i].compareTo(words[j]) > 0) {
	               String temp = words[i];
	               words[i] = words[j];
	               words[j] = temp;
	            }
	         }
	      }
	      for(int i = 0; i < n; i++) {
	         System.out.println(words[i]);
	      }
		
//		int[] arr = new int[w.length()];
//
//        for(int i=0; i<w.length(); i++){
//            arr[i] = w.charAt(i);
//        }
//        
//        do {
//        	String tmp = "";
//        	for(int i : arr) {
//        		tmp += (char) i;
//        	}
//        	System.out.println(tmp);
//        } while (nextPermutation(arr));
    }
	
	
	
	public static int stringCompare(String str1, String str2) {
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
				continue;
			} else {
				return (int) str1.charAt(i) - (int) str2.charAt(i);
			}
		}

// Edge case for strings like 
// String 1="Geeky" and String 2="Geekyguy" 
		if (str1.length() < str2.length()) {
			return (str1.length() - str2.length());
		} else if (str1.length() > str2.length()) {
			return (str1.length() - str2.length());
		}

// If none of the above conditions is true, 
// it implies both the strings are equal 
		else {
			return 0;
		}
	}
	
	
	static boolean nextPermutation(int[] array) {
	    // Find longest non-increasing suffix
	    int i = array.length - 1;
	    while (i > 0 && array[i - 1] >= array[i]) {
	        i--;
	    }
	    // Now i is the head index of the suffix
	    
	    // Are we at the last permutation already?
	    if (i <= 0) {
	        return false;
	    }
	    
	    // Let array[i - 1] be the pivot
	    // Find rightmost element that exceeds the pivot
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1]) {
	        j--;
	    }
	    // Now the value array[j] will become the new pivot
	    // Assertion: j >= i
	    
	    // Swap the pivot with j
	    int temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	    
	    // Reverse the suffix
	    j = array.length - 1;
	    while (i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	    
	    // Successfully computed the next permutation
	    return true;
	}
	 
}