package variiableAndMethods;

public class Address05 { //Opening of Class body

	//when I bring the static variable under main method, main method doesn't allow any static variable inside a static method
	// so we remove static key word from variables
	
	public static void main(String[] args) {
		String Name = "Tofael"; //static variable can't stay under static method
		int age = 44;  
		char sex = 'M';  
		double grade = 3.876;  
		
		System.out.println("My Name: " +Name + ", My age: " +age+ ", My sex: " +sex+ ", My grade: " +grade);
		
	}
 	
	
	
	

} //closing of class body
