public class PizzaDeal {

    public double deal(Pizza p) {
        return p.getPrice() * 0.9;
    }

    public boolean betterDeal(Pizza p1, Pizza p2) {
        return p1.getPrice() < p2.getPrice();
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(12.99, new Circle(8.0));
        Pizza pizza2 = new Pizza(15.99, new Rectangle(10.0, 6.0));

        PizzaDeal pizzaDeal = new PizzaDeal();

        double discountedPrice = pizzaDeal.deal(pizza1);
        System.out.println("Discounted price for pizza 1: $" + discountedPrice);

        boolean isPizza1BetterDeal = pizzaDeal.betterDeal(pizza1, pizza2);
        System.out.println("Is pizza 1 a better deal than pizza 2? " + isPizza1BetterDeal);
    }
}