package javaConstructor;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee(); // Default constructor initialize
		Employee employee2 = new Employee("Tofael"); // Parameterized constructor 01 is initialized
		Employee employee3 = new Employee("Nishat", 216754); // // Parameterized constructor 02 is initialized
		Employee employee4 = new Employee("Shams", 216755); // // Parameterized constructor 02 is initialized
		Employee employee5 = new Employee("Nasir", 216756); // // Parameterized constructor 02 is initialized
		Employee employee6 = new Employee("Shamim", 216764, 'M'); // // Parameterized constructor 03 is initialized
		Employee employee7 = new Employee("Mahmood", 216752, 'M', true); // // Parameterized constructor 04 is initialized
		Employee employee8 = new Employee(216752, 'M', true, "Titu"); // // Parameterized constructor 05 is initialized
		Employee employee9 = new Employee('F', "Hilary", 878973, false); // // Parameterized constructor 05 is initialized
		//we must have to put the variable in a sequence like the way local variable declared in constructor
		// it doesn't matter the sequence of variable declared inside sysout
		// It is possible to create a parameterized constructor with the same number of variable if they organized in a different manner. 
	
	
	}

}
