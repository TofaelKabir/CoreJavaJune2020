package lec22_java_coding_challenge_for_interview;

// https://www.youtube.com/watch?v=YWL-FyLihE8&t=450s

public class MainMethodOverloading {
	public static void main(String[] args) {
		System.out.println("Method-1");
		//The blow 3 main methods are called inside the main method with arguments recognized by the JVM
		// This methods can't be call without calling them inside main method
		//Main method can be overloaded but JVM can recognized only the signature of this main method
		main(12);
		main("hello");
		main(34, "java");
	}

	public static void main(String str) {
		System.out.println("Method -2");
	}

	public static void main(int a) {
		System.out.println("Method -3");
	}

	public static void main(int a, String str) {
		System.out.println("Method-4");
	}
}
