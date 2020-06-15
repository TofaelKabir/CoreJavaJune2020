package variiableAndMethods;
/*
 
1) What is a class in Java? (will discuss later)
-- Class is a blueprint from which individual objects are created. 
2) Is Java Strongly Typed Language? (will discuss later)
-- Yes, Java is a strongly typed language. Reason: Each and every variable must have a declared type. Primitive (int, String, char, boolean, double, short, long, float) and reference type variable.   

3) What is object in java? (will discuss later)
-- Object is an instance (illustration) of the class and Object is the physical reality.

4) What a class body contain?
-- Opening and Closing of Class body
-- Variable Declared and Initialize
-- Constructor Declared and Initialize
-- Method Declared, Implemented and Initialize

What is constructor in java?
-- A constructor is a special method that is used to initialize a newly created object and is called just after the memory is allocated for the object. 

What is Interface?
-- Interface is a Blueprint of Class. An interface is a collection of method that are defined but not implemented. It is just like Java Class, but only has static constants and abstract method. Java uses Interface to implement multiple inheritance.

What is Abstract class?

-- An abstract class is a super class that cannot be instantiated (can’t create object) and is used to define general characteristics. Contains abstract and non abstract method, can be extended by the concrete class.

5) What are the common symbols used in Java?
(  ) Parentheses
{  } Curly brace
[  ] Square bracket
<  > Angular bracket
“  “ Double Quotation or quotation
‘  ‘ Single quotation
/    Slash
\    Back slash
;    Semicolon
=    Assign operator

6) What is the Variable?
-- A variable is a container that holds values that are used in a Java program. Every variable must be declared to use a data type. 

7) Describe the classification of Variable?
-- Class Variable 2 type:
i) Primitive type - eight types - byte, short, int, long, float, double, char or boolean.
ii) reference type

8) Describe primitive type data?
--
String = “Tofael483” [Only variable start with Upper case] 
					 [V V Imp info: Not a pure primitive type]
char = ‘A’               
boolean = true or false

byte = –128 (2^7) to 127 (2^7-1)  //because of zero, 1 is deducted. (-128 TO +127)
short = –32,768 to 32,767   
int (integer) = –2,147,483,648 to 2,147,483, 647     [mostly used]
long = –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

double = decimal 6 to 7 [example: 3.1415927]   
float = decimal 15 to 16 [example: 3.1415927410125732]  [mostly used]

9) What is the difference between float and double in details?
 -- Though both float and double data type are used to represent floating point numbers in Java, a double data type is more precise than float. A double variable can provide precision up to 15 to 16 decimal points as compared to float precision of 6 to 7 decimal digits. Another significant difference between float and double is their storage requirement, double is more expensive than float. It takes 8 bytes to store a variable while float just takes 4 bytes. Which means, if memory is constraint than its better to use float than double. BTW, the double type also has larger range than float and if your numbers don't fit well in float then you have to use double in Java.
 
10) What are the most commonly used variables?
-- String, int, char, boolean, double.

 * */

public class VariablAndMethodInfo {

	public static void main(String[] args) {
		System.out.println("\"Info regarding Variabl and Method\"");

	}

}
