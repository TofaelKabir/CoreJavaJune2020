package java_nested_class;

public class TestJFK {
    public static void main(String[] args) {
        JFK jk = new JFK();
        jk.welcome();

        jk.t1.destination();
        jk.t2.domestic();
        jk.t4.international();

    }
}
