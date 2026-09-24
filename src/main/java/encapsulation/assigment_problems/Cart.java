package main.java.encapsulation.assigment_problems;

public class Cart {

    private final double[] prices;
    private int count;
    private final String cartId;

    public Cart(String cartId, int size) {
        this.cartId = cartId;
        this.prices = new double[size];
        this.count = 0;
    }

    public void addItem(double price) {
        if (count < prices.length && price > 0) {
            prices[count] = price;
            count++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return count;
    }

    public String getCartId() {
        return cartId;
    }

    public static void main(String[] args) {

        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}