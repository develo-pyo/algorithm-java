package algo_programmers;

public class SkillTest1_2 {

	public static void main(String[] args) {
		  int n = 5;
		  String answer = "";
	      String txt = "¼ö¹Ú";
	      
	      int r = n/2;
	      int mod = n%2;
	      for(int i=0; i<r; i++){
	          answer+=txt;
	      }
	      if(mod==1){
	          answer+="¼ö";
	      }
	      
	      System.out.println(answer);
	}

}
