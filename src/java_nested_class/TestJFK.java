package java_nested_class;

import java_nested_class.JFK03.Terminal4;

public class TestJFK {
	public static void main(String[] args) {
		System.out.println("\n---------------- 02 -----------------");
		JFK01 jk = new JFK01();
		jk.welcome();

		// Terminal1 terminal1 = new Terminal1(); //it's not possible

		// No enclosing instance of type JFK01 is accessible.
		// Must qualify the allocation with an enclosing instance
		// of type JFK01 (e.g. x.new A() where x is an instance of JFK01).

		jk.t1.destination();
		jk.t2.domestic();
		jk.t4.international();

		System.out.println("\n---------------- 02 -----------------");
		JFK02 jk2 = new JFK02();
		jk2.welcome();

		System.out.println("\n--------------- 03 ------------------");
		JFK03 jk3 = new JFK03();
		jk3.welcome();

		System.out.println("\n---------------- 04 -----------------");
		JFK03.Terminal4 jt4 = new JFK03.Terminal4(); // if nested static class is present, outer class can call it
		jt4.international();
		Terminal4.service(); // static method call directly by it's class

		// only nested static class is possible to instantiate together with outer class
//        JFK03.Terminal1 jt5= new JFK03.Terminal1();  //Unresolved compilation problem
//        jt5.destination();

		System.out.println("\n---------------- 05 -----------------");
		JFK04 jk4 = new JFK04();
		jk4.t1.destination();

	}
}
