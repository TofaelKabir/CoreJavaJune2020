package lec19_java_singleton;

public class Singleton3 {
    private static Singleton3 singleton = null;
    private Singleton3(){
    }
    public static Singleton3 getInstance(){
        System.out.println("From singleton class");
        return new Singleton3();
    }
    public void display(){
        System.out.println("I am on a singleton class");
    }
}