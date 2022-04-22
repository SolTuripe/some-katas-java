package morekatas.morekatas.ShoppingKata;

public class Product {
    protected String name;
    protected double price;
    protected double discount;

    public Product(){
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
