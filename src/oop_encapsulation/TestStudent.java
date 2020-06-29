package oop_encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Sharkar");
		student.setStId(483);
		student.setSex('M');
		student.setUsCitizen(false);
		student.setGrade(3.765f);  // new, we have to use f after float initialization
		student.setAge(44.68768);
		
		System.out.println("Name: "+student.getStName()+", ID: "+student.getStId()+", Sex: "+student.getSex()+", US Citizen: "+student.isUsCitizen()+", grade: "+student.getGrade()+"and Age: "+student.getAge());
		

	}

}
