package lec22_java_coding_challenge_for_interview;

/*
 * Write a function to transform input, e.g.:
Input: “Hello Mohammad Sharkar
”
Output: “Sharkar Mohammad  Hello”*/

public class ReverseByWord {

	public static void main(String[] args) {
		String s = "Hello Mohammad Sharkar";
		String t = "";

		String [] s1 = s.split(" "); // converted to a List, remove space and see what happen
		for (int i = s1.length - 1; i >= 0; i--) {
			t = t + s1[i] + " ";
		}
		System.out.println(t);

	}

}
