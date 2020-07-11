package java_oop_inheritance;

import java_variables_and_methods.NewAddress;

public class TestFamilyHierarchy {

	public static void main(String[] args) {
		System.out.println("\n*****************************");
		MyGrandfather grandfather = new MyGrandfather(); // default Constructor initialize
		grandfather.grandfatherInfo();
		
		System.out.println("\n*****************************");
		MyFather father = new MyFather();
		father.fatherInfo();
		father.grandfatherInfo();
		
		System.out.println("\n*****************************");
		MyAunt aunt = new MyAunt();
		aunt.auntInfo();
		aunt.grandfatherInfo();
		
		System.out.println("\n*****************************");
		MyUncle uncle = new MyUncle(); // class is instantiated when object is created
		uncle.uncleInfo();
		uncle.grandfatherInfo();
		
		System.out.println("\n*****************************");
		Me mySelf = new Me();
		mySelf.myInfo();
		
		System.out.println("\n*****************************");
		MySister sister = new MySister();
		sister.sisterInfo();
		sister.fatherInfo();
		sister.grandfatherInfo();
		
		System.out.println("\n*****************************");
		MyCousin1 cousin1 = new MyCousin1();
		cousin1.cousin1Info();
		
		System.out.println("\n*****************************");
		MyCousin2 cousin2 = new MyCousin2();
		cousin2.cousin2Info();
		
		System.out.println("\n*****************************");
		MyDaughter daughter = new MyDaughter();
		daughter.daughterInfo();
		
		System.out.println("\n*****************************");
		MySon son = new MySon();
		son.sonInfo();
		
		System.out.println("\n*****************************");
		MyNephew nephew = new MyNephew();
		nephew.nephewInfo();
		
		System.out.println("\n*****************************");
		MyNiece niece = new MyNiece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandfatherInfo();
		
		System.out.println("\n*****************************");
		MyGrandChild grandChild = new MyGrandChild();
		grandChild.myGrandChildInfo();
		grandChild.nieceInfo();
		grandChild.sisterInfo();
		grandChild.fatherInfo();
		grandChild.grandfatherInfo();
		
		
		
		
		
	
	}

}

