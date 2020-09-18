package lec17_5_java_collection_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue02 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("SD"); //head
        queue.add("NC");
        queue.add("WA");
        queue.add("OR");
        queue.add("FL");
        queue.add("CA");  //tail
        
        System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Queue (1) ^^^^^^^^^^^^^^^^ ");
		// to print all elements we can use - (for loop, for each loop, iterator()
		// how for loop can be used?
		Iterator<String> it = queue.iterator(); // new here
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Queue (2) ^^^^^^^^^^^^^^^^ ");
		for (String string:queue){
            System.out.println(string);
        }
		
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Queue (3) ^^^^^^^^^^^^^^^^ ");
		while(!queue.isEmpty()){
            System.out.println(queue.poll()); // if you use poll before line 7 what will happen?
        }

    }
}