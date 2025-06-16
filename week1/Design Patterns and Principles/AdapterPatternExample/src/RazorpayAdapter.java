public class RazorpayAdapter implements PaymentProcessor{
    private RazorpayGateway razorpayGateway = new RazorpayGateway();

    @Override
    public void processPayment(double amount) {
        razorpayGateway.payAmount(amount);
    }
}
