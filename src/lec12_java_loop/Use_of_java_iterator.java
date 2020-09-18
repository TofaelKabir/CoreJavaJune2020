package lec12_java_loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//You will have to loop to convert the array to a list, since Arrays.asList(value.toCharArray()) will produce a List<char[]>

// Iterator cannot be use for Array

public class Use_of_java_iterator {

	public static void main(String[] args) {
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
		
		System.out.println("\n------------ use of Iterator ---------------\n");
		Iterator iterator = ar.iterator(); //legacy type, first loop used in java
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	}


