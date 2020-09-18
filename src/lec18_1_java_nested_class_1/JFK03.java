package lec18_1_java_nested_class_1;

public class JFK03 { // OPENING OF OUTER CLASS BODY
	Terminal1 t1 = new Terminal1();
	Terminal2 t2 = new Terminal2();
	Terminal4 t4 = new Terminal4();

	public void welcome() {
		System.out.println("Welcome to JFK");
		t1.destination();
		t2.domestic();
        t4.international();
        Terminal4.service();

	}

	public class Terminal1 {

		public void destination() {

			System.out.println("Terminal 1 is for Saudi Airlines");
		}

	}

	public class Terminal2 {

		public void domestic() {

			System.out.println("Terminal 2 is for Delta local");
		}

	}
    
	// change here -- static method is added
	public static class Terminal4 { //nested static class or member class

		public void international() {

			System.out.println("Terminal 4 is for Emirates");
		}

		public static void service() {

			System.out.println("Terminal 4 give us good service");
		}

	}

}// CLOSING OF OUTER CLASS BODY
