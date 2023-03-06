package Homework1;

public class Product {
    protected String name;
    protected double price;
    protected double quantity;
    protected String unit;

    protected Product(String name, String unit, double price, double quantity){
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.quantity = quantity;
    }
}
