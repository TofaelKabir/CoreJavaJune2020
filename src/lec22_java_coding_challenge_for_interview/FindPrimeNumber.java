package lec22_java_coding_challenge_for_interview;

/*
Prime number is a positive natural number that has only two positive natural number divisors - one and the number itself.

Prime numbers are subset of natural numbers. A natural number is a positive natural number that has at least one positive divisor other than one or itself.

The number 1 is not a prime number by definition - it has only one divisor.

The number 0 is not a prime number - it is not a positive number and has infinite number of divisors.

Prime numbers list
List of prime numbers up to 100:

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, ...

Is 0 a prime number?
The number 0 is not a prime number.

Zero is not a positive number and has infinite number of divisors.

Is 1 a prime number?
The number 1 is not a prime number by definition.

One is has one divisor - itself.

Is 2 a prime number?
The number 2 is a prime number.

Two has 2 natural number divisors - 1 and 2:

2 / 1 = 2

2 / 2 = 1
 * */

public class FindPrimeNumber {

    // create a method to find out a specific number is prime number or not
    public static boolean isPrimeNumber(int num){
    	if(num <= 1){
            return false;
        }
        for(int i = 2; i<num ; i++){
            if(num % i== 0){
                return false;
            }
        }
        return true;
    }
    // if we want to find out there is a range of number is there have prime number or not

    public static void findPrimeNumber(int number){
        for(int i= 0; i<= number; i ++){
            if(isPrimeNumber(i)){ //mistake in this line
                System.out.println( i + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("The number 12 is prime number or not ? " + isPrimeNumber(12));
        System.out.println("The number 1 is prime number or not ? " + isPrimeNumber(9));
        System.out.println("The number 2 is prime number or not ? " + isPrimeNumber(2));
        System.out.println("The number 13 is prime number or not ? " + isPrimeNumber(13));

        findPrimeNumber(3);

    }
}
