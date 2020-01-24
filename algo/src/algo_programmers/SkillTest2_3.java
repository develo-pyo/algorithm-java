package algo_programmers;

import java.util.Arrays;
import java.util.Stack;

public class SkillTest2_3 {
//	무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
	public static void main(String[] args) {
		//10 20 30 30 80 90 100
		int[] people = {10, 10, 20, 30, 30, 40, 100}; 
		int limit = 100;
		int cnt = 0;
        int j = 0;
        Arrays.sort(people);
        
        
        // i    j    cnt
        // 6    0     0
        // 5    0     1         
        // 4    1     2
        // 3    1     1
        
        for(int i = people.length-1; i > j; i--) {
        	System.out.println(people[i]+"/"+people[j]);
        	System.out.println(people[i] + people[j] <= limit);
        	if(people[i] + people[j] <= limit) {
        		cnt++; 
        		j++;
        	}        		      	
        }
        
        
		System.out.println(people.length - cnt);
	}
}
