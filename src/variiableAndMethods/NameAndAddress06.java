package variiableAndMethods;

public class NameAndAddress06 { //Opening of Class body

	public String Name1;  //variable declared, not used here, written just to understand
	public static   String Name = "Tofael";  // is this variable declared or initialized?
	public static int houseNumber = 625; 
	public static char houseDirection = 'W';  
	public static int stNumber = 57;  
	public static String state = "NY";
	public static int zipCode = 10019;
	
	
	// this is void type method, not a return type method
	// method contain parentheses, class doesn't contain
	// method name can be similar as class name, but not mandatory, like -- nameAndAddress06
	// method implemented here, when you see curly brace, it means method implemented
	public static   void myInfo() { //method implemented
		System.out.println(Name+"\n"+houseNumber+houseDirection+" "+stNumber+"st \n"+state+" "+zipCode);
		
	}
	
	public static void main(String[] args) {
	//method initialized below	
	myInfo(); // a non static method can not be called by a static method, so we change the method to static
	//then a non static variable can't be call by a static method
		
	}

} //closing of class body
