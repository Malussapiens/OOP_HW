package Homework1;

public class Food extends Product {
    protected String bestBefore;

    protected Food(String name, String unit, double price, double quantity, String bestBefore) {
        super(name, unit, price, quantity);
        this.bestBefore = bestBefore;
    }

    public String toString(){
        return super.toString() + "best_before: " + bestBefore + '\n';
    }
}
