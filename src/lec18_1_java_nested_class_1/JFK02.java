package lec18_1_java_nested_class_1;

public class JFK02 { // Outer class
	Terminal1 t1 = new Terminal1();
	Terminal2 t2 = new Terminal2();
	Terminal4 t4 = new Terminal4();

	// change inside outer method body
	public void welcome() {
		System.out.println("Welcome to JFK");
		t1.destination();
		t2.domestic();
		t4.international();
	}

	public class Terminal1 { //inner class

		public void destination() {

			System.out.println("Terminal 1 is for Saudi Airlines");
		}

	}

	public class Terminal2 { //inner class

		public void domestic() {

			System.out.println("Terminal 2 is for Delta local");
		}

	}

	//change here
	public static class Terminal4 { //nested static class or member class

		public void international() {

			System.out.println("Terminal 4 is for Emirates");
		}

	}

}// CLOSING OF OUTER CLASS BODY
