package lec19_java_singleton;

public class Singleton01 {
    private static Singleton01 singleton = new Singleton01();
    private Singleton01(){
    }
    public static Singleton01 getInstance(){
        System.out.println("Singleton is being called");
        return new Singleton01();
    }
    public void display(){
        System.out.println("I am on singleton class");
    }
    public static void main(String[] args) {
        Singleton01 singleton1 = Singleton01.getInstance();  //Singleton()' has private access in 'Singleton.Singleton'
        singleton1.display();
    }

}

