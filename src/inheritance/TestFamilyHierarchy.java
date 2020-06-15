package inheritance;

public class TestFamilyHierarchy {

	public static void main(String[] args) {
		Grandfather grandfather = new Grandfather(); // default Constructor initialize
		grandfather.Name="Ismail";
		grandfather.age=434;
		grandfather.grandfatherInfo();
		
		Father father = new Father();
		father.age=65; //variable initialize
		father.Name="Johir";
		father.fatherInfo();
		
		Father father2 = new Father();
		father2.age=83;
		father2.Name="Gias";
		father2.fatherInfo();

	}

}
