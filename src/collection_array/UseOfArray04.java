package collection_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Author: Shohag, Organised by: Tofael
 */

public class UseOfArray04 {
	
	public static void main(String[] args) {
		int[] a = new int[6];
		a[0] = 15;
		a[1] = 34;
		a[2] = 59;
		a[3] = 5;
		a[4] = 28;
		a[5] = 12;
		// NEW 
		System.out.println("First index value: " + a[0]);
		System.out.println("Last index value: " + a[a.length - 1]);
		System.out.println("\tAll index value for new Array: " + Arrays.toString(a) + "\n"); // Tab =\t
		// java.util.Arrays Class --> This class contains various methods for
		// manipulating arrays (such as sorting and searching).
		Arrays.sort(a); // Sorts the specified array of bytes into ascending numerical order.
		System.out.println("First index value after update: " + a[0]);
		System.out.println("Last index value after update: " + a[a.length - 1]);
		System.out.println("\tAfter update, the value of Array is: " + Arrays.toString(a) + "\n");

		// Shohag, what is the use of it?
		Arrays.asList(a); // ---->convert to Integer Array as List //ref means ref variable of the array
		// This method returns a fixed-size list backed by the specified Arrays.
		System.out.println("\tAfter update, the value of Array is: " + Arrays.asList(a) + "\n");

		// Copying of another array:
		// To copy ref array all index value and fix the length of the new array
		// This is how we can increase the length of an Array (see below)
		
		int[] b = Arrays.copyOf(a, 10); // second argument: declaring size of new array along with old one
		b[2] = 87;
		b[6] = 36;
		b[7] = 95;
		b[8] = 18;
		System.out.println("Single index value for new Array: " + b[0]);// why output is: 55?
		System.out.println("Single index value for new Array: " + b[2]);// output: how it happen?
		System.out.println("Single index value for new Array: " + b[5]);// output: 56
		System.out.println("Single index value for new Array: " + b[7]);// output: 65
		System.out.println("Single index value for new Array: " + b[9]);// output: ?
		System.out.println("\nThe length of the array is: " + b.length);

		System.out.println("After update, the value of Array b is: " + Arrays.toString(b) + "\n");
		// copying can be done several times
		// Array vS Arrays, Arrays is a class is used to manipulate the Array
		int[] c = Arrays.copyOfRange(b, 0, 7);
		// to copy the range of the old array
		// from which index to what index (range)// here 0 is starting index and 7 is
		// length of the index, so last index is 6

		System.out.println("After update, the value of Array c is: " + Arrays.toString(c) + "\n");

		/*
		 * Arrays.equals(arr1, arr3);--->returns true if the two specified arrays of
		 * booleans are equal to one another. Two arrays are equal if they contain the
		 * same elements in the same order. Two array references are considered equal if
		 * both are null.
		 */
		System.out.println("Is Array a and c is equal? Ans: " + Arrays.equals(a, c));
		
		// What is deep equals?
		//System.out.println("Is Array a and c is equal? Ans: " +Arrays.deepEquals(a, c));
		/*
		 * returns true if the two specified arrays are deeply equal to one another. Two
		 * array references are considered deeply equal if both are null, or if they
		 * refer to arrays that contain the same number of elements and all
		 * corresponding pairs of elements in the two arrays are deeply equal.
		 */

		//for each loop is mostly used in industry, solely for Array?
		

		
		Arrays.fill(a, 300);// --->to fill the all the value same, so all value will be changed to 300 here
		System.out.println("After update, the value of Array is: " + Arrays.toString(a) + "\n");
        
		
		
		// A normal java list having four String objects
        List <String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
         
        // Print the list in console
        System.out.println(list);
 
        // An array of String objects
        String[] ay = new String[] { "First", "Second", "Third", "Fourth", "Five" }; //Literal representation of array
         
        // Print the array using default toString method - Do not Use it
        
        System.out.println(ay.toString());
         
        // Print the array using Arrays.toString() - "RECOMMENDED for simple arrays"
        System.out.println(Arrays.toString(ay));
 
        String[] arr1 = new String[] { "hundred", "hundred One" };
        String[] arr2 = new String[] { "two hundred", "thirty four" };
         
        // An array of array containing String objects //double dimension
        String[][] lalmia = new String[][] { arr1, arr2 }; //later to understand from Shohag ***
 
        // Compare the different outputs
 
        
        // Not working may be
        // Print the array using default toString method
        System.out.println(lalmia);
 
        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(lalmia));
 
        // Print the array using Arrays.deepToString() -  "RECOMMENDED for multi-dimensional array"
        System.out.println(Arrays.deepToString(lalmia));
    

	
	}
}
/*
 
 * 8. Arrays.deepHashCode(ref);----> to get the hashcode of the array (int
 * value)
 * 
 *
 * 
 * 
 * 10. Arrays.mismatch(ref1, ref2));---to find the mismatch
 * 
 * 11. Arrays.compareUnsigned(ref1, ref2));
 * 
 * 12. Arrays.compare(ref1, ref2));
 */
