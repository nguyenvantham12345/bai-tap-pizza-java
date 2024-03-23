public class PizzaClient {

    public boolean betterDeal(Pizza p1, Pizza p2) {
        return p1.getPrice() / p1.getArea() < p2.getPrice() / p2.getArea();
    }
    public void run() {
        Pizza round = new Pizza(3.99, new Circle(2.5));
        Pizza rect = new Pizza(4.99, new Rectangle(6, 4));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round + " is a better deal than " + rect + ": " + pd.betterDeal(round, rect));
    }

    public static void main(String[] args) {
        new PizzaClient().run();
    }
}
