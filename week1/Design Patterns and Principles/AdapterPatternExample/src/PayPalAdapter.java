public class PayPalAdapter implements PaymentProcessor{
    private PayPalGateway payPalGateway = new PayPalGateway();

    @Override
    public void processPayment(double amount) {
        payPalGateway.sendPayment(amount);
    }
}
