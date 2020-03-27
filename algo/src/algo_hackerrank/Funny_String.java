package algo_hackerrank;

public class Funny_String {

	public static void main(String[] args) {
		
		String input = "acd";
		
		int[] arr = new int[input.length()-1];
		
		int mid = arr.length/2;
		boolean isEven = (arr.length%2==0);
		boolean rs = true;
		System.out.println("mid:"+mid);
//	   length  5
//	        i  1  2  3  4  5
//	      i-1  0  1  2  3  4
		
//   length  2
//        i  1  2
//      i-1  0  1
		if(isEven) {
            //짝수
            for(int i=1; i<input.length(); i++) {
                if(i-1 < mid) {
                    int a = input.charAt(i-1);
                    int b = input.charAt(i);
                    arr[i-1] = Math.abs(a-b);
                    System.out.println("front : "+(i-1) 
									 + "\nback : "+arr[i-1]);
                } else {
                    int a = input.charAt(i-1);
                    int b = input.charAt(i);
                    System.out.println(">> " + (input.length()-i-1));
                    System.out.println("front : " + arr[input.length()-i-1] 
									+ "\nback : " + Math.abs(a-b));
                    if(arr[input.length()-i-1] == Math.abs(a-b)) {
                        continue;
                    } else {
                        rs = false;
                        break;
                    }
                }
            }
        } else {
            //홀수
            for(int i=1; i<input.length(); i++) {
                int tmp = 0;
                if(i-1 < mid) {
                    int a = input.charAt(i-1);
                    int b = input.charAt(i);
                    arr[i-1] = Math.abs(a-b);
                    System.out.println(arr[i-1]);
                } else if(i-1 == mid) {
                    tmp++;
                    //do nothing
                } else {
                    int a = input.charAt(i-1);
                    int b = input.charAt(i);
                    System.out.println("idx : " + (input.length()-i-1));
                    System.out.println("i , i-1 : " + i +","+(i-1));
                    System.out.println("front : " + arr[input.length()-i-1] 
									 + "\nback : " + Math.abs(a-b));
                    if(arr[input.length()-i-1] == Math.abs(a-b)) {
                        continue;
                    } else {
                        System.out.println("i:"+i);
                        rs = false;
                        break;
                    }
                }
            }
        }
		
		for(int k : arr) {
			System.out.println(k);
		}
				
		if(rs) {
			System.out.println("Funny");
		} else {
			System.out.println("Not Funny");
		}
		
		
	}
	
	
	
}
