package Homework1;

public class Drinks extends Product{
    protected double volume;
    
    protected Drinks(String name, String unit, double price, double quantity, double volume){
        super(name, unit, price, quantity);
        this.volume = volume;
    }
}
