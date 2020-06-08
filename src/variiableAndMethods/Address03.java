package variiableAndMethods;

public class Address03 { // Opening of Class body

	static String Name = "Tofael"; // String inside double quotation,
	static int age = 44; // int without any quotation
	static char sex = 'M'; // char with single quotation
	static double grade = 3.876; // double no quotaion

	public static void main(String[] args) {
		System.out.println(Name); // a non static variable can not initialize under a static method
		System.out.println(age);
		System.out.println(sex);
		System.out.println(grade);

	}

} // closing of class body
