package algo_hackerrank;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "sampleInputString";
//		int rs = 1;
//        for(int i=0; i<s.length(); i++){
//            int tmp = s.charAt(i);
//            if(tmp > 64 && 91 > tmp){
//                rs++;
//            }
//        }
//	    
//        System.out.println(rs);
//        
        
		//char to int
        char c = '/';
        int i = c;
        System.out.println(i);
        
        
        //int to char (ascii 넘버로 문자 알아내기)
        int t = 47;
        char tmp = (char)t;
        System.out.println(tmp);
        
        System.out.println(t - '0');
        
        //문자의 ascii 넘버 알아내기
        String s = "/";
        int k = s.charAt(0);
        System.out.println(k);
	}

}
