package algo_programmers;

import java.util.ArrayList;
import java.util.List;

public class SkillTest2_7 {
	
	//프로그래머스 스킬테스트 lv 2
	
//	프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 
//	각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//	또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 
//	이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
//	먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 
//	각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
	
	public static void main(String[] args) {
		int[] prog = {93,30,55};
		int[] speeds = {1, 30, 5};
		
		int[] rs = solution(prog, speeds);
		for(int i : rs) {
			System.out.print(i + " ");
		}
	}
	
	private static int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	int tmp = progresses[i];
        	int cnt = 0;
        	while(tmp < 100) {
        		tmp += speeds[i];
        		cnt++;
        	}
        	list.add(cnt);
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        int tmp = 0;
        for(int i=0; i<list.size(); i++) {
        	tmp = list.get(i);
        	int cnt = 0;
        	for(int j=i; j<list.size() && list.get(j) <= tmp; j++) {
        		cnt++;
        		i=j;
        	}
        	resultList.add(cnt);
        }
        
//        for(int i:resultList) {
//        	System.out.print(i + " ");
//        }
        
        int[] answer = new int[resultList.size()];
        
        int idx=0;
        for(int i:resultList) {
        	answer[idx] = i;
        	idx++;
        }
        
        return answer;
    }
}
