package java_different_type_of_class;

import java.util.Scanner;

// https://www.javatpoint.com/Scanner-class

public class Use_of_scanner_class {
	public static void main(String[] args) {

		System.out.println("Please enter your full name here: ");
		
		Scanner scanner = new Scanner(System.in); // System Class, in is a property of InputStream
		//TODO System.in
		String myName = scanner.nextLine();
		System.out.println("\nHey ! " + myName + " , now you know how Scanner class works!!");
		
		System.out.println("\n\nPlease enter your age here: ");
		int age = scanner.nextInt(); // nextInt for number, nextLine is for String
		System.out.println("\nYour age is: " + age);
		scanner.close();
		
	}

}
