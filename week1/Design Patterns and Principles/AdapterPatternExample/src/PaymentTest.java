public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();
        PaymentProcessor razorpay = new RazorpayAdapter();

        paypal.processPayment(1200.50);
        stripe.processPayment(875.00);
        razorpay.processPayment(432.75);
    }
}
