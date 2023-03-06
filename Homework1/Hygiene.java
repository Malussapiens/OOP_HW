package Homework1;

public class Hygiene extends Product {
    protected int amount;

    protected Hygiene(String name, String unit, double price, double quantity, int amount) {
        super(name, unit, price, quantity);
        this.amount = amount;
    }

    public String toString() {
        return super.toString() + "amount: " + '\n';
    }
}
