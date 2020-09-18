package lec21_java_input_output;


import java.text.DecimalFormat;
import java.util.Scanner;

public class InputOutput {

	// old system, no need
	
  public static void main(String[] args) {
	  int a = 23; //why we can't put the variables above main method?
	  int b = 15;
	  float c = 10.387f;
	  double d = -16.790923851565776576576;
	  int e =(int)d;
	  String m = "Mohammad";
	  String n = "Sharkar";
	  
	  System.out.printf("Value for a is %d, Value for b is %d, Value for c is %f, Value for d is %f\n",a,b,c,d);
	  System.out.printf("Value for a is %d, Value for b is %d, Value for c is %f, Value for d is %f\n",b,a,d,c);
	  
	  System.out.printf("First Name is %s, Last Name is %s\n",m,n);
	  System.out.printf("First Name is %s, Last Name is %s\n",n,m);
	  
	  
	  
	  
	  
	  
	  System.out.println(e);
	  
	  DecimalFormat df1 = new DecimalFormat (".00000");
	  System.out.println((df1.format(d)));
      
	  DecimalFormat df2 = new DecimalFormat ("0");
	  System.out.println((df2.format(d)));
	  
	  
	  System.out.println("Please Enter your full name");
	  Scanner input = new Scanner(System.in);
	  String name = input.nextLine();
	  System.out.println("Hello  "+name+", Welcome to our store");
	  
	}

}