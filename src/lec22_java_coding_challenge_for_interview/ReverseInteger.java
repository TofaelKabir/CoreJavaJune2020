package lec22_java_coding_challenge_for_interview;

public class ReverseInteger {
    public static void main(String[] args) {
        long num = 123456;
        long rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);


        // 2. use StringBuffer
        long num1 = 987654;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
