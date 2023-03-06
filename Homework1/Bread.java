package Homework1;

public class Bread extends Food {
    private String flourType;

    protected Bread(String name, String unit, double price, double quantity, String bestBefore,
            String flourType) {
        super(name, unit, price, quantity, bestBefore);
        this.flourType = flourType;

    }

    public String toString() {
        return super.toString() + "flour type: " + flourType + '\n';
    }
}
