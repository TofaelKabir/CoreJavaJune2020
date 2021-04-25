package lec22_java_coding_challenge_for_interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateOrMoreThanOneNumberPresent {
    public static void main(String[] args) {

int [] number = new int [] {1,3,3,4,2,4,5,6,7,1,3};
		
		for(int i=0; i<number.length; i++) {
			for(int j=i+1; j<number.length; j++) {
				if(number[i]==number[j]) {
					System.out.println(number[i]);
				}
			}
		}
    }
}
