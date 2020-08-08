package java_collection_stack;

import java.util.Iterator;
import java.util.Stack;

public class UseOfStack01 {

	// The Stack class represents a last-in-first-out (LIFO) stack of objects

	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("NY");  // Bottom, entered first
		stack.add("NJ");
		stack.add("CT");  //Stack can inherit Vector, add came from Vector 
		stack.push("MA"); // Own method of Stack
		stack.add("MD");
		stack.push("PA");  // Top, entered last
		
		// to check the position of CT
		System.out.println("\nThe position of CT is: " + stack.search("CT"));
		System.out.println("\nThe position of CT is: " + stack.search("WA")); //if Absent, shows -1 in console
		
		//Looks at the object at the top of this stack without removing it from the stack.
		// to find the peek element as per LIFO
		System.out.println("\nFind the element using peek(): " + stack.peek()); // LIFO: PA
		
		// Popping out peek element and find the latest peek element, may be replace
		System.out.println("\nThe 1st pop: " + stack.pop());
		
		System.out.println("\nFind the element after using pop() then peek(): " + stack.peek());
		// popping out all elements and check stack is empty or not
		System.out.println("\nThe 2nd pop: " + stack.pop());
		System.out.println("The 3rd pop: " + stack.pop());
		System.out.println("The 4th pop: " + stack.pop());
		System.out.println("The 5th pop: " + stack.pop());
		//System.out.println("The 6th pop: " + stack.pop());
		
		// check is stack empty or not
		System.out.println("\nIt will returns true because no element in our stack: " + stack.empty());
		// check is there any peek
		stack.push("CA"); //bottom //first entered
		stack.push("VA");
		stack.push("MN");  //top   //last entered
		
		System.out.println("\nFind the element after using final pop() then peek(): " + stack.peek());

		
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Stack (1) ^^^^^^^^^^^^^^^^ ");
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Stack (2) ^^^^^^^^^^^^^^^^ ");
		
		Iterator<String> it1 = stack.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
	}
}
