package lec22_java_coding_challenge_for_interview;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num;
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = scr.nextInt();
        int sum =0;
        while(num != 0){
            sum = sum + (num % 10);
            num = num/10;
        }
        System.out.println("The sum of digits is = " + sum);
    }
}
