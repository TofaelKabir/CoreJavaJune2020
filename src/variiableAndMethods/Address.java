package variiableAndMethods;

public class Address {

	public String Name = "Tofael";
	public int houseNumber = 625;
	public char houseDirection = 'W';
	public int stNumber = 57;
	public String state = "NY";
	public int zipCode = 10019;
	public boolean InUSA = true;

	public void myInfo() {
		System.out
				.println(Name + "\n" + houseNumber + houseDirection + " " + stNumber + "st \n" + state + " " + zipCode);
		System.out.println("Is the location in USA? Ans: " + InUSA);
	}
	// Grandfather is a Class
	// grandfather is a object
	// grandfather is a reference variable
	// new is a keyword
	// Grandfather a newly created Class name Grandfather

	// an object is created from Grandfather class which is a new Grandfather type
	public static void main(String[] args) {
		Address address = new Address(); // A class in instantiated here
		address.myInfo();

	}

}
