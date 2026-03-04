package Week02.Abstraction.ViaInterface;

public class StripeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment: " + amount);
    }
}
