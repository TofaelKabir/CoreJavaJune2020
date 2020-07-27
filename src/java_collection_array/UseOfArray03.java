package java_collection_array;

import java.util.Arrays;
import java.util.Iterator;

public class UseOfArray03 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */

	public static void main(String[] args) {
		int[] a = new int[6]; // declaring size of the array
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		
		a[5] = 56;

		// print single index value:

		System.out.println("\n------------- Printing single index value -------------");
		System.out.println("Single index value: " + a[0]);// output: ?
		System.out.println("Single index value: " + a[3]);// output: ?
		System.out.println("Single index value: " + a[5]);// output: ?

		System.out.println("\nThe length of the array is: " + a.length);

		// NEW FROM HERE
		// Printing all index value
		System.out.println("\n------------- Printing all index value of Array by for loop -------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("\n------------- Printing all index value of Array by for each loop -------------");
		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- Printing all index value of Array by while loop ----------\n");
		int j = 0;
		while (j < a.length) {// when the condition is true, the loop started
			System.out.println(a[j]);
			j++;
		}

		System.out.println("\n---------- Printing all index value of Array by do while loop ----------\n");
		int k = 0;
		do { // when the condition is true or false, the first loop will started
			System.out.println(a[k]);
			k += 1;
		} while (k < a.length);
		
		
		
		// We can also update value in array, how?
		System.out.println("\nBefore update, the value of a[0] is: " + a[0] + "\n");
		
		a[0] = 55;
		a[0] = 75;
		a[0] = 25;
		
		System.out.println("\nAfter update, the value of a[0] is: " + a[0] + "\n");// output:?

		
		System.out.println("\n----- Increasing the length of an Array by Copying of another array -----");
		// this is how we can  (see below)

		int[] b = Arrays.copyOf(a, 10);
		// second argument: declaring size of new array along with old one and now the
		// length is 10

		b[2] = 27;

		b[6] = 60;
		b[7] = 65;
		b[8] = 68;

		System.out.println("Single index value for new Array: " + b[0]);// why output is: 55?
		System.out.println("Single index value for new Array: " + b[2]);// output: how it happen?
		System.out.println("Single index value for new Array: " + b[5]);// output: 56
		System.out.println("Single index value for new Array: " + b[7]);// output: 65
		System.out.println("Single index value for new Array: " + b[9]);// output: ?
		System.out.println("\nThe length of the array is: " + b.length);

		// print all index value:

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array b [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// copying can be done several times

		int[] c = Arrays.copyOf(b, 12); // Array vS Arrays, Arrays is a class is used to manipulate the Array

		System.out.println("Single index value for new Array: " + c[0]);// why output is: 55?
		System.out.println("Single index value for new Array: " + c[11]);// output: ?
		System.out.println("Single index value for new Array: " + Arrays.toString(c));
		
		Arrays.sort(c); // sorting done, then print by below process //for each loop is mostly used in
						// industry, solely for Array? // organized from smaller to bigger

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array c [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		//to find the highest number
		System.out.println("\nThe highest number is: " + c[c.length - 1]);
	}
}
/*
 * 
 * Info regarding this array: java.util.Arrays Class-->This class contains
 * various methods for manipulating arrays (such as sorting and searching).
 * 
 * 
 * 1. Arrays.sort(ref);--->sorts the specified array of bytes into ascending
 * numerical order.
 * 
 * 
 * 2. Arrays.asList(ref); ---->convert to Integer Array as List //ref means ref
 * variable of the array //This method returns a fixed-size list backed by the
 * specified Arrays.
 * 
 * 3. Arrays.binarySearch(ref,value); ---->to get the index positiuon of the
 * value form the ref
 * 
 * 4. Arrays.copyOf(ref, 4); --->to copy ref array all index value and fix the
 * length of the new array
 * 
 * 5. Arrays.copyOfRange(ref, 1, 7); ---> to copy the range of the old array
 * from which index to what index (range)// here 1 is starting index and 7 is
 * lenth of the index, so last index is 6
 * 
 * 6. Arrays.deepEquals(ref1,ref2)----> returns true if the two specified arrays
 * are deeply equal to one another. Two array references are considered deeply
 * equal if both are null, or if they refer to arrays that contain the same
 * number of elements and all corresponding pairs of elements in the two arrays
 * are deeply equal.
 * 
 * 7. Arrays.equals(arr1, arr3);--->returns true if the two specified arrays of
 * booleans are equal to one another. Two arrays are equal if they contain the
 * same elements in the same order. Two array references are considered equal if
 * both are null.
 * 
 * 8. Arrays.deepHashCode(ref);----> to get the hashcode of the array (int
 * value)
 * 
 * 
 * 8. Arrays.fill(ref, value);--->to fill the all the value same //confused
 * 
 * 
 * 9. Arrays.toString(b1));--->to convert the value to String
 * 
 * 
 * 10. Arrays.mismatch(ref1, ref2));---to find the mismatch
 * 
 * 11. Arrays.compareUnsigned(ref1, ref2));
 * 
 * 12. Arrays.compare(ref1, ref2));
 */
