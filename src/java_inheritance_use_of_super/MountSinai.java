package java_inheritance_use_of_super;

public class MountSinai extends Employee {
	public String Moto;
	public int benefit;

	public MountSinai() {
		//super(); //EITHER DEFAULT OR PARAMETERIZED CONSTRUCTOR IS CALLED
		super("Tofael", 483, 'M', false);
		// it can execute only one constructor, either default or parameterized
		// constructor of super class.
		// Constructor call must be the first statement in a constructor
		super.empInfo();
		// super key word can call the method of the super class.
		super.info("Sharkar", 484, 'M', true);
		super.Location = "Manhattan"; // we can initialize more variables
		super.empId = 76876;
		// super keyword can initialize variable
		System.out.println("Location of MountSinai: " + Location);
		System.out.println("Employee ID: " + empId);
		System.out.println("This constructor is from MountSinai class");
	}

	public MountSinai(String moto, int benefit) {
		//super();
		super("RafaelA", 493, 'F', false);
		this.Moto = moto;
		this.benefit = benefit;
		super.empInfo();
		super.info("Shar", 480, 'M', true);
		super.Location = "Bronx"; // we can initialize more variables
		super.empId = 768;
		// super keyword can initialize variable
		System.out.println("Location of MountSinai: " + Location);
		System.out.println("Employee ID: " + empId);
		System.out.println(moto + " " + benefit);
	}

	public void mountSinaiInfo() {
		// super(); //we can't call constructor of super class.
		super.empInfo();
		super.info("Kabir", 487, 'M', false);
		super.Location = "Queens";
		System.out.println(Location);
		System.out.println("This method is from MountSinai class");
	}

}
