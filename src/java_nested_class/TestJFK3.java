package java_nested_class;

public class TestJFK3 {

	public static void main(String[] args) {
        JFK3 jk = new JFK3();
        jk.welcome();

        JFK3.Terminal4 jt4 = new JFK3.Terminal4();
        jt4.international();



    }

}
