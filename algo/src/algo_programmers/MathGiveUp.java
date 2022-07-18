package algo_programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MathGiveUp {
	//프로그래머스 완전탐색 모의고사
	//수포자는 수학을 포기한 사람의 준말입니다. 
//	수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
//	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	
//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	public static void main(String[] args) {
		int[] ans = {3};
		int[] rs = solution(ans);
		for(int i:rs) {
			System.out.print(i+" ");
		}
	}
	public static int[] solution(int[] answers) {
        
        int[] p1= {1,2,3,4,5};
        int[] p2= {2,1,2,3,2,4,2,5};
        int[] p3= {3,3,1,1,2,2,4,4,5,5};
        
        int[] rsp = new int[3];
        
        for(int i=0; i<answers.length; i++) {
    		if(answers[i] == p1[i%5]) {
    			rsp[0]++;
    		}
    		if(answers[i] == p2[i%8]) {
    			rsp[1]++;
    		}
    		if(answers[i] == p3[i%10]) {
    			rsp[2]++;
    		}
        }
        
        int max = 0;
        for(int i=0; i<rsp.length; i++) {
        	if(max<rsp[i]) {
        		max=rsp[i];
        	}
        }
        System.out.println("m:"+max);
        
        int size = 0;
        for(int i=0; i<rsp.length; i++) {
        	if(max == rsp[i]) {
        		size++;
        	}
        }
        
        System.out.println("s:"+size);
        System.out.println("rsplengh:"+rsp.length);
        int tmp = 0;
        int[] answer = new int[size];
        for(int i=0; i<rsp.length; i++) {
        	if(max == rsp[i]) {
        		answer[tmp] = i+1;
        		tmp++;
        	}
        }
        
        return answer;
    }
}
