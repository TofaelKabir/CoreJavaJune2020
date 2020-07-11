package java_logical_statement;

public class CompareNumber07 {
	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 45;
		if (val1%2 == 0 && val1 < val2) { // && logical and operator, || (pipe symbol) logical or operator
			System.out.println(val1 + " is an even number and shorter than " + val2);
		} else if (val1%2 == 0 && val1 > val2) {  
			System.out.println(val1 + " ia an even number and greater than " + val2);
		} else if (val1%2 != 0 && val1 < val2) {
			System.out.println(val1+ " is an odd number and shorter than "+val2);
		} else if (val1%2 == 1 && val1 > val2)  { 
			System.out.println(val1 + " is an odd number and greater than " + val2);
		}else if (val1%2 ==0 && val1!=val2) {
			System.out.println(val1 + " is an even number and not equal to "+ val2);
		}else if (val1%2 ==0 && val1==val2) {
			System.out.println(val1 + " is an even number and equal to "+ val2);
		}else if (val1%2 !=0 && val1!=val2) {
				System.out.println(val1 + " is an odd number and not equal to "+ val2);
		}else if (val1%2 !=0 && val1>=val2) {
			System.out.println(val1 + " is an odd number and (greater than or) equal to "+ val2);
			
		}else {
			System.out.println("This is not a valid case");
		}
		
	}
 
}
