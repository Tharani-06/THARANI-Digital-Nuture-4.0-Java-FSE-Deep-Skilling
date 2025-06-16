public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Ben");
        Observer webUser = new WebApp("Mia");

        market.registerObserver(mobileUser);
        market.registerObserver(webUser);

        market.setStockPrice(925.50);
        market.setStockPrice(950.75);

        market.removeObserver(webUser);

        market.setStockPrice(980.00);
    }
}