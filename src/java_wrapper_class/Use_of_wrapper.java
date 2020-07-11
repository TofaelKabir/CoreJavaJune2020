package java_wrapper_class;

public class Use_of_wrapper { //Wrapper Class Concept, read below
    //https://www.developer.com/java/data/understanding-java-wrapper-classes.html

public static void main(String[] args) {

//conversion from String to integer

String stName = "100";
System.out.println(stName);
System.out.println(stName+20);
System.out.println(stName+"  "+20);
int stId = Integer.parseInt(stName);
System.out.println(stId);
System.out.println(stId+20);
System.out.println(stId+"         "+20); //explain why?

//conversion from String to integer (when not a pure number)

String stName2 = "100W";
System.out.println(stName2);
System.out.println(stName2+20);
System.out.println(stName2+"  "+20);
//int stId2 = Integer.parseInt(stName2);
//System.out.println(stId2+20); //because parseInt method can't convert non pure integer to String,
//System.out.println(stId2+"         "+20); //Thus show run time error , but not compilation error

//conversion from String to double

String stFullName = "3.15";
System.out.println(stFullName);
System.out.println(stFullName+1.25);
System.out.println(stFullName+"  "+1.25);
double stGrade = Double.parseDouble(stFullName);
System.out.println(stGrade);
System.out.println(stGrade+1.36);
System.out.println(stGrade+"         "+1.35); //explain why?

//conversion from String to character (is not possible, because no method created for that)
//there is no method name parserCharacter, because String is a collection of Character 
//rather we find a method

char sex = Character.toUpperCase('m'); 
System.out.println(sex);

//conversion from String to boolean

String employee1 = "true";
System.out.println(employee1);
System.out.println(employee1+"  "+20);
boolean usCitizen1 = Boolean.parseBoolean(employee1);
System.out.println(usCitizen1);

//conversion from String to boolean by default (by default boolean is false)

String employee2 = " ";
System.out.println(employee2); //what will print?
System.out.println(employee2+"  "+20);
boolean usCitizen2 = Boolean.parseBoolean(employee2);
System.out.println(usCitizen2);

//conversion from integer to String

int empId = 2188458;
System.out.println(empId);
System.out.println(empId+251);
System.out.println(empId+"  "+251);
String empName = String.valueOf(empId);
System.out.println(empName);
System.out.println(empName+20); //explain why?

}

}
