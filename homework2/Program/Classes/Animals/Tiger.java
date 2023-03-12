package Homework2.Program.Classes.Animals;

import Homework2.Program.Classes.Animals.Base.WildAnimal;

public class Tiger extends WildAnimal {

    private Tiger(String animalTitle, Double height, Double weight, String eyeColor,
            String sound, String habitArea, String catchDate) {
        super(animalTitle, height, weight, eyeColor, sound, habitArea, catchDate);
    }

    public Tiger(Double height, Double weight, String eyeColor, String habitArea,
            String catchDate) {
        this("Тигр", height, weight, eyeColor, "ГРРР!", habitArea, catchDate);
    }
}
