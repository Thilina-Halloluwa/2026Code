package Week02.Abstraction.ViaAbstractClass;

public class CreditCardPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
}
