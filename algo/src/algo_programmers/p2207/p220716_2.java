package algo_programmers.p2207;

import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
public class p220716_2 {

    public static void main(String[] args) {
        int result = solution(new int[]{3,1,2,3});
        System.out.println(result);
    }
    public static int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        if(set.size() >= nums.length/2){
            return nums.length/2;
        }
        return set.size();
    }

}
