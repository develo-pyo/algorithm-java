package algo_programmers;

import java.util.Arrays;

public class p220716_ {
    public static void main(String[] args) {
        boolean answer = true;
        String[] phone_book = new String[]{"123", "12", "1234", "123", "12345"};
        boolean rs = solution(phone_book);
        System.out.println(rs);
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        //Arrays.stream(phone_book).forEach(System.out::println);

        for(int i=0; i < phone_book.length; i++){
            for(int j=i+1; j < phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[0])){
                    return false;
                }
            }
        }

        return answer;
    }

}
