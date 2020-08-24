package java_access_modifiers_default;

public class G {
	String Info = "This is coming from a variable which is default";

	G() {
		System.out.println("This is coming from a constructor which is default");
	}

	void msg1() {
		System.out.println("This is coming from a method which is default");
	}
	

	public static void main(String args[]) {
		System.out.println("---------- deafault modifeir can be accessed within the class ----------");
		System.out.println("---------- deafault modifeir can be accessed within the package ----------\n");
		G obj = new G();
		obj.msg1(); 
		System.out.println(obj.Info);
	}
}