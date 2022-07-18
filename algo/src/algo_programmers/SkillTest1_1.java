package algo_programmers;

public class SkillTest1_1 {
	//프로그래머스 스킬테스트1
	public static void main(String[] args) {
		String[] strings = {"aaa", "bbb", "bcb", "cbb"};
		
		String[] answer = new String[strings.length];
	    int n = 1;
	    
	    for(int i=0; i<strings.length; i++){
	        for(int j=0; j<strings.length-i-1; j++){
	            if(strings[j].charAt(n) > strings[j+1].charAt(n)){
	                String tmp = strings[j+1];
	                strings[j+1] = strings[j];
	                strings[j] = tmp;
	            } else if(strings[j].charAt(n) == strings[j+1].charAt(n)){
	                if(strings[j].compareTo(strings[j+1])>0) {
	                	String tmp = strings[j+1];
		                strings[j+1] = strings[j];
		                strings[j] = tmp;
	                }
	            }
	        }
	    }
	    
	    for(String s : strings) {
	    	System.out.print(s+" ");
	    }
	    
	    //return answer;
	}
}
