package morekatas.morekatas.ShoppingKata;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> shoppingProducts = new ArrayList<>();
    private double total = 0.0;

    public ShoppingCart() {
    }

    public void addProduct(Product product) {
        shoppingProducts.add(product);
    }

    public double totalPrice() {
        for(Product product : shoppingProducts) {
            total += product.getPrice();
        } return total;
    }
}
