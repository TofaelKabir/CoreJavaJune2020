package java_variables_and_methods;

public class Address {

	public String Name = "Tofael";
	public int houseNumber = 625;
	public char houseDirection = 'W';
	public int stNumber = 57;
	public String state = "NY";
	public int zipCode = 10019;
	public boolean InUSA = true;

	public void myInfo() {
		System.out.println(Name + "\n" + houseNumber + houseDirection + " " + stNumber + "st \n" + state + " " + zipCode);
		System.out.println("Is the location in USA? Ans: " + InUSA);
	}
	// Address is a Class
	// address is a object
	// address is also called a reference variable
	// new is a keyword
	// Address is a newly created Class name Address

	// an object is created from Address class which is a new Address type
	public static void main(String[] args) {
		Address address = new Address(); // A class in instantiated here
		address.myInfo();

	}

}
