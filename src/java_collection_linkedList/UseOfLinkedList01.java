package java_collection_linkedList;

import java.util.LinkedList;

public class UseOfLinkedList01 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Tofael");
		ll.add("Sharif");
		ll.add("Shohag");
		ll.add("Lobid");
		ll.add("Tofael");
		ll.add("Sharif");
		ll.add("Shohag");
		ll.add("Lobid"); // Repetition possible
		System.out.println("The length of the LinkedList is: " + ll.size());
		System.out.println("\nPrinting single index value of LinkedList: " + ll.get(0));
		System.out.println("Printing single index value of LinkedList: " + ll.get(1));
		
		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of LinkedList ^^^^^^^^^^^^^^^^ ");
		int a = 0; //why int?
		while (ll.size() > a) {
			System.out.println(ll.get(a));
			a++;
		}
	}
}
