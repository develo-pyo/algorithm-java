package algo_programmers.before2207;

public class SkillTest1_2 {

	public static void main(String[] args) {
		  int n = 5;
		  String answer = "";
	      String txt = "수박";
	      
	      int r = n/2;
	      int mod = n%2;
	      for(int i=0; i<r; i++){
	          answer+=txt;
	      }
	      if(mod==1){
	          answer+="수";
	      }
	      
	      System.out.println(answer);
	}

}
