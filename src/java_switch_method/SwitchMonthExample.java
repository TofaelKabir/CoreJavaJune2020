package java_switch_method;

/*
The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement. The switch statement works with byte, short, int, long, enum types, String and some wrapper types like Byte, Short, Int, and Long. Since Java 7, you can use strings in the switch statement.

In other words, the switch statement tests the equality of a variable against multiple values.

Points to Remember:
There can be one or N number of case values for a switch expression.
The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
The case values must be unique. In case of duplicate value, it renders compile-time error.
The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
The case value can have a default label which is optional.
 * */
public class SwitchMonthExample {
	public static void main(String[] args) {
		// Specifying month number
		int month = 7;
		String monthString = "";
		// Switch statement
		switch (month) {
		// case statements within the switch block
		case 1:
			monthString = "1 - January";
			break;
		case 2:
			monthString = "2 - February";
			break;
		case 3:
			monthString = "3 - March";
			break;
		case 4:
			monthString = "4 - April";
			break;
		case 5:
			monthString = "5 - May";
			break;
		case 6:
			monthString = "6 - June";
			break;
		case 7:
			monthString = "7 - July";
			break;
		case 8:
			monthString = "8 - August";
			break;
		case 9:
			monthString = "9 - September";
			break;
		case 10:
			monthString = "10 - October";
			break;
		case 11:
			monthString = "11 - November";
			break;
		case 12:
			monthString = "12 - December";
			break;
		default:
			System.out.println("Invalid Month!");
		}
		// Printing month of the given number
		System.out.println(monthString);
	}

}
