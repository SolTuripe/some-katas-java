package morekatas.morekatas.ShoppingKata;

public class BookProduct extends Product implements Discount {

    private double discount = 0;

    public BookProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount() {
        if(discount > 10){
            return  this.price = price - ((price/100)*10);
        }
        return this.price = price - ((price/100)*discount);
    }
}
