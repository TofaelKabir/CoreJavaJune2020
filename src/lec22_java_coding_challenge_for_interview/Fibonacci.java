package lec22_java_coding_challenge_for_interview;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
    	//mistake, no new method is necessary.
        int [] fibo = new int[40];
        for (int i = 0; i < 40; i++) { //mistake int
            if(i<2) { //mistake only i<2
                fibo[i] = i; //mistake =i
            }else{
                fibo[i] = fibo [i-1]+ fibo[i-2];
            }
        }
        System.out.println(Arrays.toString(fibo));
    }
}
