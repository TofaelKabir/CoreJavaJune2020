package java_different_type_of_method;

public class testCalculator {

	public static void main(String[] args) {
		System.out.println("\n-------------------------------------");
		Calculator1 cal1 = new Calculator1();
		cal1.addition();
		cal1.subtraction();
		
		System.out.println("\n-------------------------------------");
		Calculator2 cal2 = new Calculator2();
		cal2.addition();
		cal2.subtraction();	
		
		System.out.println("\n-------------------------------------");
		Calculator3 cal3 = new Calculator3();
		cal3.addition(50, 10);
		cal3.subtraction(60, 12);
		
		System.out.println("\n-------------------------------------");
		Calculator4 cal4 = new Calculator4();
		cal4.addition(50, "34");
		// cal4.addition(50, "abc"); // not possible, because string value can't be turn to int
		
		System.out.println("\n-------------------------------------");
		Calculator5 cal5 = new Calculator5();
		cal5.addition("12", 67, "37");
		
		System.out.println("\n-------------------------------------");
		Calculator6 cal6 =new Calculator6();
		cal6.multiplication();
		//TODO the result is not correct
		
		System.out.println("\n-------------------------------------");
		Calculator7 calculator7 = new Calculator7();
		calculator7.empID(2188458, "Mohammad", "Sharkar", 'M', false);
		
		System.out.println("\n-------------------------------------");
		Calculator8 calculator8 = new Calculator8();
		calculator8.empID(678458, "Abu", "Barkar", 'M', true);

	}

}
