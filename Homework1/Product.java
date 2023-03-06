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
    
    public String toString() {
        String pName = "name: " + name;
        String pPrice = "price: " + price;
        String pQuantity = "quantity: " + quantity;
        String pUnit = "unit: " + unit;
        return pName + '\n' + pPrice + '\n' + pUnit + '\n' + pQuantity + '\n';
    }
}
