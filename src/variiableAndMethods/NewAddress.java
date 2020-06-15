package variiableAndMethods;

public class NewAddress {

	public String Name;
	public int houseNumber;
	public char houseDirection;
	public int stNumber;
	public String state;
	public int zipCode;
	public boolean InUSA;

	public void myInfo() {
		System.out
				.println(Name + "\n" + houseNumber + houseDirection + " " + stNumber + "st \n" + state + " " + zipCode);
		System.out.println("Is the location in USA? Ans: " + InUSA);
	}

}
