package lec17_2_java_collection_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList05 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {
		// getting new ArrayList -by default constructor-->initial capacity (ic) 10
		ArrayList ar = new ArrayList();
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add(5); // different data type is allowed, here int is used
		ar.add(""); // null is allowed for String Type
		ar.add("Manir");
		ar.add("Orfat");
		ar.add("Tofael");// duplicate value is allowed
		ar.add("Imran");
		ar.add(5.5); // ? type
		ar.add('M'); // different data type is allowed, here char is used
		ar.add(5, "Nafasat"); // replacing value: adding in index [5]
		ar.add("Mohammad");// ic is [10]-- then capacity will be increased to [ic*(3/2)+1]=16

		ar.remove(2);

		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // in Array this is length
//new
		ArrayList ar34 = new ArrayList(20); //what does it mean by 20? we decide the capacity to 20
		ArrayList ar44 = new ArrayList(ar); //what does it mean by ar? we decide the capacity to the size of ar, 11, as 1 is remove
		
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output:
		System.out.println("Single index value: " + ar.get(1)); // output:
		System.out.println("Single index value: " + ar.get(2)); // output:
		System.out.println("Single index value: " + ar.get(5)); // output:
		System.out.println("Single index value: " + ar.get(9)); // output:
		System.out.println("Single index value: " + ar.get(10)); // output: //what will happen if you wanna put 11 after
																	// remove of 1 index?

		System.out.println("2nd last index value: " + ar.get(ar.size() - 2)); // output:

		System.out.println("\nThe new Array List: " + ar);

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of ArrayList ^^^^^^^^^^^^^^^^ ");
		// to print all elements (for loop, for each loop, iterator()
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		//NEW
		// generic comes in java 1.5 -> by defining the type
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Mohammad");
		ar1.add("Tofael");
		ar1.add("Kabir");
		ar1.add("");
		ar1.add("Sharkar");
		ar1.add("44"); // can it take integer? remove " "

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of String type ArrayList ^^^^^^^^^^^^^^^^ ");

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}

		// Using char type
		ArrayList<Character> ar2 = new ArrayList<Character>();
		ar2.add('A');
		ar2.add('B');
		ar2.add('C');
		//ar2.add(''); //Why it will not work

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of Charcter type ArrayList ^^^^^^^^^^^^^^^^ ");

		for (int i = 0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}
		// Using Integer type
		ArrayList<Integer> ar31 = new ArrayList<Integer>();
		ar31.add(483);
		ar31.add(484);
		ar31.add(485);
		//ar31.add(); //Why it will not work

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of Integer type ArrayList ^^^^^^^^^^^^^^^^ ");

		for (int i = 0; i < ar31.size(); i++) {
			System.out.println(ar31.get(i));
		}
	}
}
