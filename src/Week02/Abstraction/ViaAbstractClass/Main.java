package Week02.Abstraction.ViaAbstractClass;

public class Main {
    public static void main(String[] args) {

        Payment payment = new PayPalPayment();

        payment.validateTransaction();
        payment.processPayment(150.0);

    }
}
