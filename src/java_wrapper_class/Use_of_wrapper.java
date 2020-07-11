package java_wrapper_class;

public class Use_of_wrapper { //Wrapper Class Concept, read below
    //https://www.developer.com/java/data/understanding-java-wrapper-classes.html
	//https://www.tutorialspoint.com/java/java_numbers.htm#:~:text=All%20the%20wrapper%20classes%20(Integer,taken%20care%20by%20the%20compiler.
public static void main(String[] args) {

System.out.println("\n................. conversion from String to integer .....................\n");
String stName = "100";
System.out.println(stName); //100
System.out.println(stName+20); //10020
System.out.println(stName+"  "+20);//100  20
System.out.println(Integer.parseInt(stName)); //turn it to int from String //100
System.out.println(Integer.parseInt(stName)+20); //120
System.out.println(Integer.parseInt(stName)+"         "+20); //100       20


System.out.println("\n................. conversion from String to integer (when not a pure number) .....................\n");
String stName2 = "100W";
System.out.println(stName2); //100W
System.out.println(stName2+20); //100W20
System.out.println(stName2+"  "+20); //100W  20, SEE WHY i COMMENT OUT NEXT 2 LINE
//System.out.println(Integer.parseInt(stName2)+20); //because parseInt method can't convert non pure integer to String,
//System.out.println(Integer.parseInt(stName2)+"         "+20); //Thus show run time error , but not compilation error


System.out.println("\n................. conversion from String to double .....................\n");
String stFullName = "3.15";
System.out.println(stFullName); //3.15
System.out.println(stFullName+1.25); //3.151.25
System.out.println(stFullName+"  "+1.25); //3.15  1.25
System.out.println(Double.parseDouble(stFullName)); //3.15
System.out.println(Double.parseDouble(stFullName)+1.36); //4.51
System.out.println(Double.parseDouble(stFullName)+"         "+1.35); //3.15          1.35

//conversion from String to character (is not possible, because no method created for that)
//there is no method name parserCharacter, because String is a collection of Character 
//rather we find a DIFFERENT method
System.out.println("\n................. conversion from String to character .....................\n");
char sex = Character.toUpperCase('m'); 
System.out.println(sex);


System.out.println("\n................. conversion from String to boolean .....................\n");
String employee1 = "true";
System.out.println(employee1); //true
System.out.println(employee1+"  "+20); //true   20
System.out.println(Boolean.parseBoolean(employee1)); //true


System.out.println("\n................. conversion from String to boolean by default (by default boolean is false) .....................\n");
String employee2 = " ";
System.out.println(employee2); //what will print? empty
System.out.println(employee2+"  "+20);
System.out.println(Boolean.parseBoolean(employee2)); // important interview que


System.out.println("\n................. conversion from integer to String .....................\n");
int empId = 2188458;
System.out.println(empId); //2188458
System.out.println(empId+251); //2188709
System.out.println(empId+"  "+251); //2188458  251
System.out.println(String.valueOf(empId)); //2188458
System.out.println(String.valueOf(empId)+20); //explain why? 218845820

}

}
