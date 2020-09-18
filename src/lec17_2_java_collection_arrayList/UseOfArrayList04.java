package lec17_2_java_collection_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList04 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {
		// getting new ArrayList -by default constructor-->initial capacity (ic) 10
		ArrayList ar = new ArrayList();
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add(5); // it will be removed
		ar.add(""); 
		ar.add("Manir");
		//NAFASAT WILL COME HERE
		ar.add("Orfat");
		ar.add("Tofael");// duplicate value is allowed
		ar.add("Imran");
		ar.add(5.5); 
		ar.add('M'); // different data type is allowed, here char is used
		ar.add(5, "Nafasat"); // adding value: adding in index [5] //NEW
		ar.add("Mohammad");// ic is [10]-- then capacity will be increased to [ic*(3/2)+1]=16 [always same
							// formula]

		ar.remove(2); //NEW  //INDEX NUMBER 2 is remove

		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // in Array this is length

		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output:
		System.out.println("Single index value: " + ar.get(1)); // output:
		System.out.println("Single index value: " + ar.get(2)); // output:
		System.out.println("Single index value: " + ar.get(4)); // output:
		System.out.println("Single index value: " + ar.get(5)); // output:
		System.out.println("Single index value: " + ar.get(9)); // output:
		System.out.println("Single index value: " + ar.get(10)); // output: //what will happen if you wanna put 11 after

		System.out.println("Single index value: " + ar.get(ar.size() - 1)); // output:

		System.out.println("\nThe new Array List: " + ar);

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of ArrayList ^^^^^^^^^^^^^^^^ ");
		// to print all elements (for loop, for each loop, iterator() is used, for loop is better
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}
