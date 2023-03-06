package Homework1;

public class Eggs extends Food {
    private int amount;

    protected Eggs(String name, String unit, double price, double quantity, String bestBefore, 
                    int amount){
        super(name, unit, price, quantity, bestBefore);
        this.amount = amount;
    }
}
