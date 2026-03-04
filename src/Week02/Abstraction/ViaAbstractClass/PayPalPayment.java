package Week02.Abstraction.ViaAbstractClass;

public class PayPalPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}