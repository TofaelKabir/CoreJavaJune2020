package java_inheritance_use_of_super;

public class Employee {
	public String EmpName;
	public int empId;
	public char sex;
	public boolean usCitizen;
	public String Location;

	public Employee() {
		System.out.println("This constructor is from Employee class");
	}

	public Employee(String empName, int empId, char sex, boolean usCitizen) {
		this.EmpName = empName;
		this.empId = empId;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: "+empName+", Id: "+empId+", Sex: "+sex+" and US Citizen: "+usCitizen);
	}
	
	// Void or no return method or non parameterized method
	public void empInfo() {
		System.out.println("This method is from Employee class");
	}
	
	// parameterized method
	public void info(String empName, int empId, char sex, boolean usCitizen){
		this.EmpName = empName;
		this.empId = empId;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(empName+" "+empId+" "+sex+" "+usCitizen);
	}
	

}
