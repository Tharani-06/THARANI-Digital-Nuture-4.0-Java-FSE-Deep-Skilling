public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(1500.00);

        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(1200.50);
    }
}
 