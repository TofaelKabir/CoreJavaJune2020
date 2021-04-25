package lec22_java_coding_challenge_for_interview;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
    	int [] array = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        Arrays.sort(array);
        
        System.out.println("The Array is : " + Arrays.toString(array));
        System.out.println("The largest number is : "+ array[array.length-1]);
        System.out.println("The smallest number is :" + array[0]);
        
        
        int [] array2 = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        Arrays.sort(array2, 3, 23); //sorted from 3 to 22
        System.out.println("The Array is : " + Arrays.toString(array2));
        
    }
}

