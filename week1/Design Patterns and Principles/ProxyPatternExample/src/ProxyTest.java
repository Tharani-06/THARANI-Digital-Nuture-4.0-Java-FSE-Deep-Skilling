public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("pic1.jpg");
        Image image2 = new ProxyImage("pic2.jpg");

        System.out.println("--- First time displaying pic1 ---");
        image1.display();

        System.out.println("\n--- Displaying pic1 again ---");
        image1.display();

        System.out.println("\n--- First time displaying pic2 ---");
        image2.display();
    }
}
