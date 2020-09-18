package lec13_2_java_access_modifiers_private;

public class C {
	private String Info = "This is coming from a variable which is private";

	private C() {
		System.out.println("This is coming from a constructor which is private");
	}

	private void msg1() {
		System.out.println("This is coming from a method which is private");
	}
	

	public static void main(String args[]) {
		System.out.println("---------- private modifeir can only be accessed within the class ----------");
		System.out.println("---------- It cannot be accessed from outside the class ----------");
		C obj = new C();
		obj.msg1(); 
		System.out.println(obj.Info);
		
	}
}