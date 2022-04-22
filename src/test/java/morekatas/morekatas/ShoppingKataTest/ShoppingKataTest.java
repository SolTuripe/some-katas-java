package morekatas.morekatas.ShoppingKataTest;

import morekatas.morekatas.ShoppingKata.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;

import org.junit.jupiter.api.Test;

public class ShoppingKataTest {

    @Test
    void PriceOfFreeProductsAlwaysZero() {
        FreeProducts freeProduct = new FreeProducts("avocado");

        assertThat(freeProduct.getPrice(), equalTo(0.0) );
    }

    @Test
    void AllProductsHaveANameAndAPrice() {
        Product product = new Product("apples", 1.2);

        assertThat(product, hasProperty("name"));
        assertThat(product, hasProperty("price"));
    }

    @Test
    void ADiscountCanBeAddedToFoodProducts() {
        FoodProducts product = new FoodProducts("apples", 5.0);
        product.setDiscount(2.5);
        assertThat(product.getDiscount(), equalTo(2.5));
    }

    @Test
    void ThePriceOfFoodProductsWithoutDiscountIsTheOriginalPrice(){
        FoodProducts product = new FoodProducts("apples", 1.2);
        product.setDiscount(0.0);
        product.applyDiscount();
        assertThat(product.getPrice(), equalTo(1.2));
    }

    @Test
    void ThePriceOFFoodProductsWithDiscountIsApplied() {
        FoodProducts product = new FoodProducts("apples", 11.5);
        product.setDiscount(5.0);
        product.applyDiscount();
        assertThat(product.getPrice(), equalTo(10.925));
    }

    @Test
    void ShoppingCartHasProductsAndItsPriceIsTheSumOfPricesWithDiscounts() {
        ShoppingCart shoppingCart = new ShoppingCart();
        FoodProducts foodProducts = new FoodProducts("apples", 11.5);
        FreeProducts freeProducts = new FreeProducts("avocado");
        FoodProducts pasta = new FoodProducts("pasta", 10.0);

        shoppingCart.addProduct(foodProducts);
        shoppingCart.addProduct(freeProducts);
        shoppingCart.addProduct(pasta);
        pasta.setDiscount(50.0);
        pasta.applyDiscount();
        foodProducts.setDiscount(5.0);
        foodProducts.applyDiscount();

        assertThat(shoppingCart.totalPrice(), equalTo(15.925));
    }

    @Test
    void BookProductDiscountCantBeHigherThan10() {
        BookProduct book = new BookProduct("Maus", 19.99);

        book.setDiscount(50.0);
        book.applyDiscount();

        assertThat(book.getPrice(), equalTo(17.991));
    }

}
