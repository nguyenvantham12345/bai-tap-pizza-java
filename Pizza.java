public class Pizza {
    private String size;
    private List<String> toppings;
    private double price;

    public Pizza(String size) {
        this.size = size;
        this.toppings = new ArrayList<>();
        this.price = 0.0;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void calculatePrice() {
        // Logic to calculate price based on size and toppings
        // ...
    }

    public void displayPizzaInfo() {
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppings);
        System.out.println("Price: $" + price);
    }
}
