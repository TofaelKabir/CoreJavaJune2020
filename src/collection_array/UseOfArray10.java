package collection_array;

import java.util.Random;
import java.util.Scanner;

public class UseOfArray10 {
	/*
	 * Author: Tofael
	 */

	public static void main(String[] args) {
		//how Random works

        Random random = new Random(); //chooosing randomly, not inputting, so no System.in

        int a = random.nextInt(); //without limit(show negative number too)
        //boolean a = random.nextBoolean();
        //int a = random.nextInt(100); //with limit
        System.out.println("Randomly chosen number1: " + a);
        System.out.println("Randomly chosen number2: " + random.nextInt());
       
    }
}
