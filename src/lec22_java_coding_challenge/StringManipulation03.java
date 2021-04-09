package lec22_java_coding_challenge;

import java.util.Arrays;

public class StringManipulation03 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {
		String s1 = "My name is Nawshad";
		String s2 = "My name is Nawshad";
		String s3 = "Monir";
		String s4 = "monir";
		

		// To compare
		System.out.println(s1.equals(s2)); // true (as both are same)
		System.out.println(s1.equals(s3)); // false (as both are not same)
		System.out.println(s3.equals(s4)); // false (java is case sensitive)

		// To ignore upper/lower case issues:
		System.out.println(s3.equalsIgnoreCase(s4) + "\n");// true

		// To print part of String: substring()
		System.out.println(s1.substring(0, 5)); // 0 is initialized block, 5 is conditional block <5
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.substring(1, 5));
		System.out.println(s1.substring(3, 12));

		// To avoid white space: trim() (remove leading and trailing space, not from
		// middle)
		String s5 = "          Hello World!  ";
		System.out.println("\nAfter trimming:" + s5.trim());

		// To replace
		System.out.println("After replacing but no trim:" + s5.replace('H', 'h'));
		System.out.println("After replacing and trim:" + s5.trim().replace('!', ','));

		String date = "02/14/2020";
		System.out.println("After replacing the date: " + date.replace('/', '-'));
		// To replace all
		System.out.println("After replacing complete word: " + s5.replaceAll(s5, "Hey Hey captian!"));

		// Concatenation : concat()
		String s7 = "My name is Nawshad";
		String s6 = " Amin";
		System.out.println("\n" + s7.concat(s6));
		
		System.out.println(s3.concat(" Bhai"));

		// we can also concat by using '+' operator
		System.out.println(s7 + s6);
		System.out.println("Lau" + " = " + "Kodu");

		// use of split()
		String line = "I am a java developer";

		String[] words = line.split(" "); // converted to a List
		System.out.println("\nString split with delimiter: " + Arrays.toString(words));

		String[] twoWords = line.split(" ", 3);
		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";

		String[] numbers = wordsWithNumbers.split("\\|");

		System.out.println("String split with special character: " + Arrays.toString(numbers));

		// split() to get the string into pieces->changes into String[]
		System.out.println("\n^^^^^^^^^^^^^ changing s1 into String[] ^^^^^^^^^^^^^^^^ ");
		String[] ar = s1.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("\n-------------------------------------------");
		String s8 = "Hello_Selenium_java_Jenkins";
        String array[]=s8.split("_");
        for(int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
	}
}
