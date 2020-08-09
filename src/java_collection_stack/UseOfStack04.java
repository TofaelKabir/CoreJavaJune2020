package java_collection_stack;

import java.util.Iterator;
import java.util.Stack;

public class UseOfStack04 {
    public static void main(String[] args) {
        Stack <String> stack = new Stack();
        stack.add("SD"); //bottom
        stack.add("NC");
        stack.add("OR");
        stack.add("CA"); //top

        System.out.println("\n------------ Printing all the element by for each loop (1) ------------");
        for (String string : stack) {
			System.out.println(string);
		}
        System.out.println("\n------------ Printing all the element by iterator (2) ------------");
		Iterator <String >iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n------------ Printing all the element by While loop (3) ------------");
        while(!stack.empty()){
        System.out.println(stack.pop());
    }
  }
}
