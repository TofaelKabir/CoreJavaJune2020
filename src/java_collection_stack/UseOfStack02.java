package java_collection_stack;

import java.util.Stack;

public class UseOfStack02 {
    public static void main(String[] args) {
        Stack <String> stack = new Stack();   //Stack is a class

        stack.add("NY"); //bottom, first
        stack.add("NC");
        stack.add("OR");
        stack.add("TX");
        stack.add("AZ");
        stack.add("CA"); //top, last
     
        // Looks at the object at the top of this stack without removing it from the stack.
        System.out.println(stack.peek()); 
        // Removes the object at the top of this stack and returns that object as the value of
        // this function. POP remove the item from the stack first, last in first out
        System.out.println(stack.pop()); 
        //Pushes an item onto the top of this stack.
        System.out.println(stack.push("SC")); 
        //Returns the 1-based position where an object is on this stack., TO FIND THE INDEX NUMBER WHERE IT IS DECLARED
        System.out.println(stack.search("NC"));
        //If absent it says -1
        System.out.println(stack.search("MO"));  
        //If absent it says -1
        System.out.println(stack.search("MN")); 
        //Tests if this stack is empty. //WHY?
        System.out.println(stack.empty());        
    }
}
