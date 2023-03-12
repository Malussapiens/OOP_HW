package Homework2.Program.Classes.Animals.Base;

import java.util.Map;
import java.util.HashMap;

import Homework2.Program.Interfaces.Animals.IAnimal;

public abstract class Animal implements IAnimal {

    protected String animalTitle;
    protected Double height;
    protected Double weight;
    protected String eyeColor;
    protected String sound;
    private String[] info;
    private static Map<String, String> fieldNames = Map.of(
        "height", "String",
        "weight", "Double", 
        "eyeColor", "String");

    public Animal(String animalTitle, Double height, Double weight, String eyeColor, String sound) {
        this.animalTitle = animalTitle;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.sound = sound;
    }

    public String makeSound() {
        StringBuilder sb = new StringBuilder();
        return sb.append(animalTitle + " говорит: " + sound).toString();
    }

    public String getInfo() {
        info = new String[] { "animal: ", animalTitle, "height: ", height.toString(),
                "weight: ", weight.toString(),
                "eye_color: ", eyeColor.toString(),
                "sound: ", sound };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < info.length; i += 2) {
            sb.append(info[i]);
            sb.append(info[i + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static HashMap<String, String> getFieldNames() {
        HashMap<String, String> fNames = new HashMap<>();
        fNames.putAll(fieldNames);
        return fNames;
    }
}