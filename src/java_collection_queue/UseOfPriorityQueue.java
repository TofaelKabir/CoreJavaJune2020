package java_collection_queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseOfPriorityQueue {
//question: not coming sequentially
	public static void main(String args[]) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("NY"); 
		queue.add("NJ");
		queue.add("MA");
		queue.add("CA");
		queue.add("MD");
		queue.add("TX"); 
		
		// to remove specific obj/value-->if not mentioned removes peek
		queue.remove("MA"); // removes 
		
		//follow ASCII VALUE FOR PRIORITY
		
		// In a priority queue, an element with high priority is served before an element with low priority. In some implementations, if two elements have the same priority, they are served according to the order in which they were enqueued, while in other implementations, ordering of elements with the same priority is undefined.
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());

		// iterating the queue elements:
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of PriorityQueue (1) ^^^^^^^^^^^^^^^^ ");
		Iterator it1 = queue.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("\n"+queue.poll());
		System.out.println("after removing two elements:");
		Iterator<String> it2 = queue.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
