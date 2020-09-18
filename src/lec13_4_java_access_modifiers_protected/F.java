package lec13_4_java_access_modifiers_protected;

import lec13_1_java_access_modifiers_public.M;
import lec13_5_java_access_modifiers_outside_package.Address;
import lec13_5_java_access_modifiers_outside_package.Calculator;

public class F extends Address {
	public static void main(String args[]) {
		System.out.println("---------- protected modifier can also be accessed outside the class ----------");
		System.out.println("---------- protected modifier can be accessed within the package ----------\n");
		E obj = new E();
		obj.msg1();
		System.out.println(obj.Info);
		
		System.out.println("\n\n---------- protected modifeir can be accessed inside the package by subclass (child class) only----------");
		N an1 = new N();
		an1.n();
		
		System.out.println("\n\n---------- protected modifeir can be accessed inside the package without subclass (child class) only----------");
		N an2 = new N();
		an2.n();
		
		//TODO Have to show Nasir -- mySalary, why not working?
		System.out.println("\n\n---------- protected modifier can be accessed outside the package by subclass (child class) only ----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
//		Address address = new Address(); 
//		address.mySalary();
		
		
		System.out.println("\n\n---------- protected modifier can not be accessed outside the package without subclass (child class) ----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
//		Calculator cal = new Calculator();
//		cal.division();
	}

}
