package lec19_java_singleton;

public class Singleton {
	
    private Singleton(){
    	System.out.println("From private constructor of Singleton");
    }
    
    public static Singleton getInstance(){
        System.out.println("Singleton is being called");
        return new Singleton();
    }

    public static void main(String[] args) {
        Singleton.getInstance();  //Singleton()' has private access in 'Singleton.Singleton'

    }

}



