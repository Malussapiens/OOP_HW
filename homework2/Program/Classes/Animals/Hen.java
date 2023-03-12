package Homework2.Program.Classes.Animals;

import Homework2.Program.Classes.Animals.Base.Bird;

public class Hen extends Bird {
    private Hen(String animalTitle, Double height, Double weight, String eyeColor,
    String sound, int flyAltitude){
        super(animalTitle, height, weight, eyeColor, sound, flyAltitude);
    }

    public Hen(Double height, Double weight, String eyecolor, int flyAltitude){
        this("Курица", height, weight, eyecolor, "Ко-ко-ко!", flyAltitude);
    }

}
