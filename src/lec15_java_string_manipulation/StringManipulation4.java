package lec15_java_string_manipulation;

public class StringManipulation4 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 * This is very important
	 */
	public static void main(String[] args) {
		String s = "Hello I am learning java , practice interview ";
        String s1 = "Hello my name is zaytuna , I hope I can get a nice job soon";
        String s2 = "Hello i am LEARNING JAVA , PRACTICE interview ";
        String s3 = " hello world ";

		System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s3.trim());
        System.out.println(s3.replace(" ",""));

        String DOB = "01/28/1987";
        System.out.println(DOB.replace("/","-"));

        String s4 = "Hello_Selenium_java_Jenkins";
        String array[]=s4.split("_");
        for(int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
        // concatinate
        String s5 = "carre";
        System.out.println(s5.concat("r"));
        // String and int concat
        String x = "hello";
        String y = "world";
        int a = 100;
        int b = 200;
        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
        System.out.println(x+y+(a+b));

	}
}
