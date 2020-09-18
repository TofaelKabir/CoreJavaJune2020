package lec13_4_java_access_modifiers_protected;

public class E {
	protected String Info = "This is coming from a variable which is protected";

	protected E() {
		System.out.println("This is coming from a constructor which is protected");
	}

	protected void msg1() {
		System.out.println("This is coming from a method which is protected");
	}
	

	public static void main(String args[]) {
		System.out.println("---------- protected modifeir can be accessed within the class ----------");
		System.out.println("---------- protected modifeir can be accessed within the package ----------\n");
		E obj = new E();
		obj.msg1(); 
		System.out.println(obj.Info);
	}
}