package lec17_5_java_collection_queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue01 {
	public static void main(String[] args) {
		// Example: when we make queue in DMV, FIFO(First In First Out)

		Queue<String> queue = new LinkedList<String>(); // Queue is a interface
		queue.add("SD"); // head , first
		queue.add("NC");
		queue.add("WA");
		queue.add("OR");
		queue.add("FL");
		queue.add("CA"); // tail , last

		/*
		 * Basically the concept of Queue is FIFO(First In First Out).So accessing the
		 * particular index or the element in the queue is not possible. The other way
		 * is to get a particular element you need to delete it unless and until you get
		 * it. If you need to access elements by index, you want a list, not a queue.
		 */

		// Returns the number of elements in this collection
		System.out.println("The number of elements in this Queue: " + queue.size());

		// poll() method, Specifically deal with the first Element, then Retrieves and remove,
		if (queue.peek().equalsIgnoreCase("sd")) {
            System.out.println("The head of this queue retrieved and removed: " + queue.poll());
        }
		//System.out.println(queue.poll());
		
		// Retrieves, but does not remove, the head of this queue, or returns null if
		// this queue is empty.
		System.out.println("The head of this queue retrieved and not removed: " + queue.peek());

		/*
		 * Inserts the specified element into this queue if it is possible to do so
		 * immediately without violating capacity restrictions, returning true upon
		 * success and throwing an IllegalStateException if no space is currently
		 * available.
		 */
		System.out.println("The value of this queue is added: " + queue.add("NM")); // why boolean?
		//need to know when it will be false, and need to know the capacity
		
		System.out.println(queue.contains("NM"));
		System.out.println(queue);
		
		// Retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println("The head of this queue retrieved and removed: " + queue.poll());

		// Retrieves and removes the head of this queue. This method differs from poll
		// only in that it throws an exception if this queue is empty.
		System.out.println("The head of this queue retrieved and removed: " + queue.remove());

		// Retrieves, but does not remove, the head of this queue. This method differs
		// from peek only in that it throws an exception if this queue is empty.
		System.out.println("The head of this queue retrieved: " + queue.element()); // Why WA? got it?
		System.out.println(queue);
	}
}
