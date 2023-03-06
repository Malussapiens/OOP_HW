package Homework1;

public class Milk extends Food {
    protected double fatPercent;

    protected Milk(String name, String unit, double price, double quantity, String bestBefore,
            double fatPercent) {
        super(name, unit, price, quantity, bestBefore);
        this.fatPercent = fatPercent;
    }

    public String toString() {
        return super.toString() + "fat_percent: " + fatPercent + '\n';
    }
}
