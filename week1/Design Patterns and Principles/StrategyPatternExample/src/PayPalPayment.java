public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("paid" + amount + "using PalPay.");
    }

}
