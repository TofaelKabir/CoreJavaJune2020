package java_inheritance_use_of_super;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("\n---------------------------------------------------------------");
		Employee employee = new Employee();
		System.out.println("\n---------------------------------------------------------------");
		employee.empInfo();
		
		System.out.println("\n---------------------------------------------------------------");
		MountSinai mountSinai = new MountSinai();
		System.out.println("\n---------------------------------------------------------------");
		mountSinai.mountSinaiInfo();
		
		System.out.println("\n---------------------------------------------------------------");
		MountSinai mountSinai2 = new MountSinai("abc", 5);
	}

}
