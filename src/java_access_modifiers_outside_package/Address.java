package java_access_modifiers_outside_package;

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
	
	void myJob() {
		System.out.println("This is a default method from Address class");
	}
	
	protected void mySalary() {
		System.out.println("Protected method from Address class");
	}
	
}
