package lec17_2_java_collection_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList08 {
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

		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output:
		System.out.println("Single index value: " + ar.get(1)); // output:
		System.out.println("Single index value: " + ar.get(2)); // output:
		System.out.println("Single index value: " + ar.get(5)); // output:
		System.out.println("Single index value: " + ar.get(9)); // output:
		System.out.println("Single index value: " + ar.get(10)); // output: //what will happen if you wanna put 11 after
																	// remove of 1 index?

		System.out.println("Single index value: " + ar.get(ar.size() - 2)); // output:

		System.out.println("\nThe new Array List: " + ar);

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of ArrayList ^^^^^^^^^^^^^^^^ ");
		// to print all elements (for loop, for each loop, iterator()
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// generic comes in java 1.5 -> by defining the type
		ArrayList<String> ar1 = new ArrayList();
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
		// ar2.add(''); //Why it will not work

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of Charcter type ArrayList ^^^^^^^^^^^^^^^^ ");

		for (int i = 0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}
		// Using Integer type
		ArrayList<Integer> ar31 = new ArrayList<Integer>();
		ar31.add(483);
		ar31.add(484);
		ar31.add(485);
		// ar31.add(); //Why it will not work

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of Integer type ArrayList ^^^^^^^^^^^^^^^^ ");

		for (int i = 0; i < ar31.size(); i++) {
			System.out.println(ar31.get(i));
		}
		// user-defined class obj--see the StudyGroup Class
		// Creating obj of the StudyGroup Class by parameterized constructor and passing
		// value:
		StudyGroup s1 = new StudyGroup("Muhammad", 50, "Tofayel");
		StudyGroup s2 = new StudyGroup("Muhammad", 40, "Sharif");
		StudyGroup s3 = new StudyGroup("Muhammad", 30, "Sohag");
		StudyGroup s4 = new StudyGroup("Muhammad", 30, "Sohag"); // why s4 is not printing? get it?

		// now we can put the obj of the StudyGroup type obj (s1,s2,s3,s4))
		ArrayList<StudyGroup> ar3 = new ArrayList<StudyGroup>();
		ar3.add(s1);
		ar3.add(s2);
		ar3.add(s3);

		// print by using for each loop/enhanced for loop/advanced for loop
		System.out.println(
				"\n^^^^^^^^^^^^^ Printing all the value of user defined class obj ArrayList ^^^^^^^^^^^^^^^^ ");
		for (StudyGroup s : ar3) {
			System.out.println(s.fname + " " + s.lname + " " + s.age);
		}

		// use of addAll() method
		ArrayList ar5 = new ArrayList(); // creaing new ArrayList
		ar5.add("A");
		ar5.add("B");
		ar5.add("C");

		// applied addAll() in ar[]-->now in ar[] we have also ar5[] value too
		ar.addAll(ar5);
		System.out.println("After using addAll method the new Array List: " + ar);
		// before loop, legacy type
		System.out.println("\n^^^^^^^^^^^^^ After using Iterator the new Array List ^^^^^^^^^^^^^^^^ ");
		Iterator ar7 = ar.iterator();
		while (ar7.hasNext()) {
			System.out.println(ar7.next());
		}
		
		
		
		//NEW
		// use of removeAll() method
		ar.removeAll(ar5);
		System.out.println("\n^^^^^^^^^^^^^ After using removeAll()+Iterator the new Array List ^^^^^^^^^^^^^^^^ ");
		Iterator ar8 = ar.iterator();
		while (ar8.hasNext()) {
			System.out.println(ar8.next());
		}

		// use of retainAll()--only keeps common value between two ArrayList obj

		ArrayList<String> ar9 = new ArrayList(); // creating new ArrayList
		ar9.add("Shohag"); // -------this is common
		ar9.add("Rahman");
		ar9.add("salma");
		ar9.add("Tofael");
		// applying retainAll() below, which will keep the common from the list
		ar.retainAll(ar9);
		//ar9.retainAll(ar); //what will happen when we do this? question: need to solve, doesn't work
		System.out.println("\n^^^^^^^^^^^^^ After using retainAll the new Array List ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
