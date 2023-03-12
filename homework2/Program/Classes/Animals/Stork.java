package Homework2.Program.Classes.Animals;

import Homework2.Program.Classes.Animals.Base.Bird;

public class Stork extends Bird {
    private Stork(String animalTitle, Double height, Double weight, String eyeColor,
    String sound, int flyAltitude){
        super(animalTitle, height, weight, eyeColor, sound, flyAltitude);
    }

    public Stork(Double height, Double weight, String eyecolor, int flyAltitude){
        this("Аист", height, weight, eyecolor, "Тр-р-р-р!", flyAltitude);
    }
}
