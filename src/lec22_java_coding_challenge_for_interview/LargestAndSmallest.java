package lec22_java_coding_challenge_for_interview;

import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
    	int [] array = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        // we have to initialize smallest and largest first
        int largest = array[0];
        int smallest = array[0];
        for(int i =1; i < array.length;i++){
            if(array[i]> largest){
                largest= array[i];
            }
            else if(array[i]< smallest){
                smallest= array[i];
            }
        }
        
        
        System.out.println("The largest number is : "+ largest);
        System.out.println("The smallest number is :" + smallest);
//        no need of the below code
        System.out.println("The Array is : " + Arrays.toString(array));
        
    }
}

/*
int [] number = {-2, 45, 55, 23, -4, 8};

int largest = number[0];
int smallest = number [0];

for (int i = 1; i<number.length; i++) {
	if(number[i]>largest) {
		largest =number[i];
	}else if (number[i]<smallest) {
		smallest = number[i];
	}
}
System.out.println(largest);
System.out.println(smallest);

*/
