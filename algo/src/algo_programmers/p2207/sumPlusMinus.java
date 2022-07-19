package algo_programmers.p2207;

//https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class sumPlusMinus {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{4,7,12}, new boolean[]{true, false, true}));
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * -1;
            }
        }

        return answer;
    }
}
