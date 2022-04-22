package morekatas.morekatas.ShoppingKata;

public class FoodProducts extends Product implements Discount {

    private Double discount;

    public FoodProducts(String name, double price){
        super(name,price);
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double applyDiscount() {
        return this.price = price - ((price/100) * discount);
    }
}
