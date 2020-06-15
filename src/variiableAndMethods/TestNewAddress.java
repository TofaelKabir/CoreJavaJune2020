package variiableAndMethods;

public class TestNewAddress {
	public static void main(String[] args) {

		NewAddress myAddress = new NewAddress();  //instantiated
		myAddress.Name = "TOFAEL";
		myAddress.houseNumber = 625;
		myAddress.houseDirection = 'W';
		myAddress.stNumber = 57;
		myAddress.state = "NY";
		myAddress.zipCode = 10029;
		myAddress.InUSA = true;
		myAddress.myInfo();

		NewAddress shamaAddress = new NewAddress();
		shamaAddress.Name = "Shama";
		shamaAddress.houseNumber = 6748;
		shamaAddress.houseDirection = 'N';
		shamaAddress.stNumber = 23;
		shamaAddress.state = "GA";
		shamaAddress.zipCode = 30088;
		shamaAddress.InUSA = true;
		shamaAddress.myInfo();

	}

}
