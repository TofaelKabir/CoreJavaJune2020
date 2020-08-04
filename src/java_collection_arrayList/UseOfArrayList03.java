package java_collection_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList03 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {

		// getting new ArrayList -by default constructor-->initial capacity (ic) 10
		ArrayList <String> ar = new ArrayList <String>();  //angular bracket <  >, [] square bracket, {}=curly braces
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add("Manir");
		ar.add("Orfat");
		
		System.out.println("\n^^^^^^^^^^^^^ After using for each loop the new Array List ^^^^^^^^^^^^^^^^ ");
		for (String s : ar) {      //for each loop
			System.out.println(s);
		}

	}
}
