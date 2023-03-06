package Homework1;

public class BabyCare extends Product {
    protected String minAge;
    protected boolean hypoallergenic;

    protected BabyCare(String name, String unit, double price, double quantity, 
                        String minAge, boolean hypoallergenic){
        super(name, unit, price, quantity);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }
}
