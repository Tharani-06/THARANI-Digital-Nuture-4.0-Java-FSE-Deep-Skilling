public class StripeAdapter implements PaymentProcessor{
    private StripeGateway StripeGateway = new StripeGateway();

    @Override
    public void processPayment(double amount) {
        StripeGateway.makePayment(amount);
    }
}
