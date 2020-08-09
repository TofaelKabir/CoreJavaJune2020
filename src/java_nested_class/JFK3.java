package java_nested_class;

public class JFK3 { //OPENING OF OUTER CLASS BODY
    JFK3.Terminal1 jt1 = new JFK3.Terminal1();
    JFK3.Terminal4 jt5 = new JFK3.Terminal4();

    public void welcome(){
        System.out.println("Welcome to JFK");
        jt1.destination();
        Terminal4.service();

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
        public static void service(){

            System.out.println("Terminal 4 give us good service");
        }

    }


}//CLOSING OF OUTER CLASS BODY
