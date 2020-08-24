package java_access_modifiers_private;

public class D extends Q {
	public static void main(String args[]) {
		System.out.println("---------- Show unresolved compilation problems because ----------");
		System.out.println("---------- private modifeir can not be accessed outside the class ----------");
		System.out.println("---------- private modifeir can not be accessed within the package ----------\n");

		
		System.out.println("\n\n---------- private modifeir can't be accessed inside the package by subclass (child class) or without subclass----------");
//		Q aq1 = new Q();
//		aq1.q();
		
		System.out.println("\n\n---------- private modifier can not be accessed outside the package with or without subclass (child class) ----------");
//		C obj = new C();
//		obj.msg1();
//		System.out.println(obj.Info);

		// A class cannot be private or protected except nested class.
		
	}

}
