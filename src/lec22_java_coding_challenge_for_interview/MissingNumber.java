package lec22_java_coding_challenge_for_interview;

public class MissingNumber {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,7,8,9};
        int sum =0;
        for(int i =0; i < array.length; i ++){
            sum = sum + array[i]; //mistake
        }
        System.out.println(sum);

        int total =0;
        for( int j = 1; j <=9; j ++){ //mistake j=1, j<=9
            total = total + j; //mistake
        }
        System.out.println(total);
        System.out.println(" The missing number is "+ (total -sum));
    }
}
