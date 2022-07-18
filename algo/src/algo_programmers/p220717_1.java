package algo_programmers;


import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class p220717_1 {
    public static void main(String[] args) {
//        int[][] arr ={{60, 50}
//                , {30, 70}
//                , {60, 30}
//                , {80, 40}};

        int[][] arr ={{60, 50}
                , {30, 70}
                , {80, 60}
                , {60, 30}
                , {80, 40}};
        System.out.println(solution(arr));
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        int maxLeft = sizes[0][0];
        int maxRight = sizes[0][1];
        int leftOfMaxRight = 0;
        int rightOfMaxLeft = 0;

        for(int i=1; i<sizes.length; i++){
            int left = sizes[i][0];
            int right = sizes[i][1];
            System.out.println("l:"+left);
            System.out.println("r:"+right);

            if(maxLeft < left){
                maxLeft = left;
                if(right > rightOfMaxLeft){
                    rightOfMaxLeft = right;
                }
            }
            if(maxRight < right){
                maxRight = right;
                if(left > leftOfMaxRight){
                    leftOfMaxRight = left;
                }
            }
        }
        System.out.println("ml:"+maxLeft);
        System.out.println("mr:"+maxRight);
        int maxVal = 0;

        if(maxLeft > maxRight){
            maxVal = maxLeft;
        } else {
            maxVal = maxRight;
        }
        // 전체 요소에서 최대값 확인
        System.out.println("mv : "+maxVal);


        //
        int maxSecond = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                if(maxSecond < sizes[i][1]){
                    maxSecond = sizes[i][1];
                }
            } else {
                if(maxSecond < sizes[i][0]){
                    maxSecond = sizes[i][0];
                }
            }
        }
        System.out.println("ms : " + maxSecond);

        return maxVal * maxSecond;
    }


    //다른사람 풀이
    public int solution1(int[][] sizes) {
        return Arrays.stream(sizes).reduce((a, b) -> new int[]{
                Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
        }).map(it -> it[0] * it[1]).get();
    }

    //다른사람풀이2
    public int solution2(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            int paramMax = Math.max(size[0], size[1]);
            int paramMin = Math.min(size[0], size[1]);

            if (paramMax > max) {
                max = paramMax;
            }

            if (paramMin > min) {
                min = paramMin;
            }
        }
        return max * min;
    }
}
