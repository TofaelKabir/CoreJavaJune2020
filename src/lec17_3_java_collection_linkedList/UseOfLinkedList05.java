package lec17_3_java_collection_linkedList;

import java.util.LinkedList;



public class UseOfLinkedList05 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(345);
		ll.add(483);
		ll.add(483);
		ll.add(483);
		ll.add("Tofael");  // String used
		ll.add(3.483);   // double used
		ll.add('M');   //Char used
		ll.add(435);
		ll.add(533);
		ll.add(345);
		ll.add(876);
		ll.add(789); // Repetition possible
		ll.addFirst(308);
		ll.addLast(310);
		ll.set(0, 307);// new here, replacing the value from second
		ll.remove(3); // removing fourth one
		ll.removeFirst();
		ll.removeLast();
		System.out.println("The length of the LinkedList is: " + ll.size());
		System.out.println("\nPrinting single index value of LinkedList: " + ll.get(0));
		System.out.println("Printing single index value of LinkedList: " + ll.get(1));
		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of LinkedList ^^^^^^^^^^^^^^^^ ");
		
		int a = 0; 
		while (ll.size() > a) {
			System.out.println(ll.get(a)+ " ");
			a++;
//have to fix it later			
//			LinkedList<String> linkedList = new LinkedList<String>();
//			linkedList.add("Paypal");
//			linkedList.add("Google");
//			linkedList.add("Yahoo");
//			linkedList.add("IBM");
//			linkedList.add("Facebook");
//	 
//			// ListIterator approach
//			System.out.println("ListIterator Approach: ==========");
//			ListIterator<String> listIterator = linkedList.listIterator();
//			while (listIterator.hasNext()) {
//				System.out.println(listIterator.next());
//			}
//	 
//			System.out.println("\nLoop Approach: ==========");
//			// Traditional for loop approach
//			for (int i = 0; i < linkedList.size(); i++) {
//				System.out.println(linkedList.get(i));
//			}
//	 
//			// Java8 Loop
//			System.out.println("\nJava8 Approach: ==========");
//	 
//			// forEach Performs the given action for each element of the Iterable until all elements have been processed or
//			// the action throws an exception.
//			linkedList.forEach(System.out::println);	
		}}

}
