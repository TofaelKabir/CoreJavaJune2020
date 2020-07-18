package java_different_type_of_method;

public class SwitchVowelExample {
	public static void main(String[] args) {
		char ch = 'a'; // we initialize our query
		switch (ch) {
		case 'a':
			System.out.println("Vowel a");
			break;
		case 'e':
			System.out.println("Vowel e");
			break;
		case 'i':
			System.out.println("Vowel i");
			break;
		case 'o':
			System.out.println("Vowel o");
			break;
		case 'u':
			System.out.println("Vowel u");
			break;
		case 'A':
			System.out.println("Vowel A");
			break;
		case 'E':
			System.out.println("Vowel E");
			break;
		case 'I':
			System.out.println("Vowel I");
			break;
		case 'O':
			System.out.println("Vowel O");
			break;
		case 'U':
			System.out.println("Vowel U");
			break;
		default:
			System.out.println("Consonant");
		}
	}

}
