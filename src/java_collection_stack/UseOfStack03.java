package java_collection_stack;

import java.util.Stack;

public class UseOfStack03 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		stack.add("SD");
		stack.add("NC");
		stack.add("OR");
		stack.add("CA");

		if (stack.peek().equalsIgnoreCase("ca")) {
			System.out.println(stack.pop());
		}
		
		System.out.println("\n--------------- Popping until stack is empty----------------------");
		while(!stack.empty()){
	        System.out.println(stack.pop());
	    }
		
		
	}
}
