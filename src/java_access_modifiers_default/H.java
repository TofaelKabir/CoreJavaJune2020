package java_access_modifiers_default;

import java_access_modifiers_outside_package.Address;
import java_access_modifiers_outside_package.Calculator;
import java_access_modifiers_protected.N;

public class H extends Address {
	public static void main(String args[]) {
		System.out.println("---------- default modifeir can also be accessed outside the class ----------");
		System.out.println("---------- default modifeir can be accessed within the package ----------\n");
		G obj = new G();
		obj.msg1();
		System.out.println(obj.Info);
		
		System.out.println("\n\n---------- default modifeir can be accessed inside the package by subclass (child class) only----------");
		P ap1 = new P();
		ap1.p();
		
		System.out.println("\n\n---------- default modifeir can be accessed inside the package without subclass (child class) only----------");
		P ap2 = new P();
		ap2.p();
		
		
//		System.out.println("\n\n---------- default modifeir can't be accessed outside the package by subclass (child class) ----------");
//		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
//		Address address = new Address(); 
//		address.myJob();
//		
//		System.out.println("\n\n---------- default modifeir can't be accessed outside the package without subclass (child class) ----------");
//		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
//		Calculator cal1 = new Calculator();
//		cal1.multiplication();
		
	}

}
