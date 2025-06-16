public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("WebApp (" + user + "): New stock price ₹" + stockPrice);
    }
}