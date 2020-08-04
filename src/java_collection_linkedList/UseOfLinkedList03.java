package java_collection_linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class UseOfLinkedList03 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Tofael");
		ll.add("Sharif");
		ll.add("Shohag");
		ll.add("Lobid");
		ll.add("Sohan");
		ll.add("Ayaz");
		ll.addFirst("Manir");
		ll.addLast("Orfat");
		ll.set(1, "Shafi");// new here, replacing the value from second
		ll.remove(3); // removing fourth one
		ll.removeFirst();
		ll.removeLast();
		System.out.println("The length of the LinkedList is: " + ll.size());
		System.out.println("\nPrinting single index value of LinkedList: " + ll.get(0));
		// System.out.println("Printing single index value of LinkedList: " +
		// ll.get(3));
		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of LinkedList ^^^^^^^^^^^^^^^^ ");
		int a = 0;
		while (ll.size() > a) {
			System.out.println(ll.get(a));
			a++;
		}

//		Iterator<String> it = ll.iterator();  //new here
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
