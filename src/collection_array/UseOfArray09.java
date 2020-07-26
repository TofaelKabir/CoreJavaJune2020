package collection_array;

import java.util.Scanner;

public class UseOfArray09 {
	/*
	 * Author: Tofael
	 */
	public static void main(String[] args) {
    
        int [] a = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");

        for(int j=0; j<a.length;j++) {
            a[j] = sc.nextInt();
            System.out.println(a[j]);
        }
        for(int i=0; i<a.length;i++){ //for printing all of them
            System.out.println(a[i]);
       }
        sc.close();
    }
}