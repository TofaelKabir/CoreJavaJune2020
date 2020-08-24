package java_nested_class_2;

public class PaymentSystem05 {
    PayByCreditCard payByCreditCard = new PayByCreditCard();
   //PayByCreditCardLambda payByCreditCardLambda = new PayByCreditCardLambda(); //if non static we can use

    public static void processPayment() {
        System.out.println("process customer payment");
        //PayByCreditCardLambda.processPaymentByCreditCardLambda();

    }

    public class PayByPayPal {
        public void processPaymentByPayPal() {
            System.out.println("process customer payment by PayPal");
        }
    }

    public class PayByCrypto {
        public void processPaymentByCrypto() {
            System.out.println("process customer payment by Crypto");
        }
    }

    public static class PayByCreditCard {

        public void processPaymentByCreditCard() { //non static
            System.out.println("process customer payment by Credit Card");
            Pay pay = new Pay() {
                @Override
                public void paymentMethod() {
                    System.out.println("System will take credit card");
                }
            };
            pay.paymentMethod();
        }

        public interface Pay { // this is a nested inner Interface
            public void paymentMethod();
        }

    }

    public static class PayByCreditCardLambda { //static

        public static void processPaymentByCreditCardLambda() { //static
            System.out.println("process customer payment by Credit Card with lambda style");
            Pay pay = () -> System.out.println("System will take credit card with lambda");
            pay.paymentMethod();
        }

        public interface Pay {
            void paymentMethod();
        }

    }

}

