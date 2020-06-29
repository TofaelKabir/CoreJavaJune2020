package oop_encapsulation;

public class Student {
	private String StName;
	private int stId;
	private char sex;
	private boolean usCitizen;
	private float grade;
	private double age;
	
	public String getStName() {
		return StName;
	}
	public int getStId() {
		return stId;
	}
	public char getSex() {
		return sex;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public float getGrade() {
		return grade;
	}
	public double getAge() {
		return age;
	}
	
	public void setStName(String stName) {
		StName = stName;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	

}
