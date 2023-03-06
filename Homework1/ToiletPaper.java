package Homework1;

public class ToiletPaper extends Hygiene{
    private int numOfLayers;
    protected ToiletPaper(String name, String unit, double price, double quantity, int amount, 
                        int numOfLayers){
        super(name, unit, price, quantity, amount);
        this.numOfLayers = numOfLayers;
    }

    public String toString(){
        return super.toString() + "num_of_layers: " + numOfLayers + '\n';
    }
}
