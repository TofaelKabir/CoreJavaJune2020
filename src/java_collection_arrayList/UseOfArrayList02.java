package java_collection_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList02 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {

		// getting new ArrayList -by default constructor-->initial capacity (ic) 10
		ArrayList ar = new ArrayList();
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add(5); // different data type is allowed, here int is used
		ar.add(""); // empty is allowed for String Type
		ar.add("Manir");
		ar.add("Orfat");
		ar.add("Tofael");// duplicate value is allowed
		ar.add("Imran");
		ar.add(5.5); // ? type
		ar.add('M'); // different data type is allowed, here char is used
		ar.add("Nafasat");
		ar.add("Mohammad");// ic is [10]-- then capacity will be increased to [ic*(3/2)+1]=16

		System.out.println("\n^^^^^^^^^^^^^ After using Iterator the new Array List ^^^^^^^^^^^^^^^^ ");
		Iterator iterator = ar.iterator(); //legacy type, first loop used in java
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
