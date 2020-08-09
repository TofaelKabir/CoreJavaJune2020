package java_nested_class;

public class JFK2 { //OPENING OF OUTER CLASS BODY
    Terminal1 t1= new Terminal1();
    Terminal2 t2 = new Terminal2();
    Terminal4 t4 = new Terminal4();

    public void welcome(){
        System.out.println("Welcome to JFK");
        t1.destination();
        t2.domestic();
        t4.international();
    }

  public class Terminal1{ //OPENING OF inner CLASS BODY

        public void destination(){

            System.out.println("Terminal 1 is for Saudi Airlines");
        }

    } //CLOSING OF inner CLASS BODY
    public class Terminal2{

        public void domestic(){

            System.out.println("Terminal 2 is for Delta local");
        }

    }
    public static class Terminal4{

        public void international(){

            System.out.println("Terminal 4 is for Emirates");
        }

    }


}//CLOSING OF OUTER CLASS BODY
