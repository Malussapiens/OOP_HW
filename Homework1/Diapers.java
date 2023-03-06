package Homework1;

public class Diapers extends BabyCare {
    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Diapers(String name, String unit, double price, double quantity, 
                    String minAge, boolean hypoallergenic, String size, int minWeight, int maxWeight,
                    String type) {
        super(name, unit, price, quantity, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

}
