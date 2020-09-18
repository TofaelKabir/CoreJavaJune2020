package lec07_java_oop_inheritance_02;

public class TestClass {

	public static void main(String[] args) {
		ClassC cc = new ClassC();
		cc.methodC();
		
		ClassB cb = new ClassB();
		cb.methodB();
		cb.methodC();
		
		
		ClassA ca = new ClassA();
		ca.methodA();
		ca.methodB();
		ca.methodC();
		
		ClassD cd = new ClassD();
		cd.methodD();
		cd.methodC();
	
		ClassE ce = new ClassE();
		ce.methodE();
		ce.methodC();
	}

}
