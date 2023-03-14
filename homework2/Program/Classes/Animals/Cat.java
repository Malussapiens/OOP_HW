package Homework2.Program.Classes.Animals;

import Homework2.Program.Classes.Animals.Base.PetAnimal;
import java.util.Map;
import java.util.HashMap;


public class Cat extends PetAnimal {

    private Boolean hasFur;
    private String[] info;
    private static Map<String, String> fieldNames = PetAnimal.getFieldNames();

    private Cat(String animalTitle, String name, String breed, double height, double weight,
            String eyeColor, Boolean isVaccinated, String color,
            String birthdate, Boolean hasFur, String sound) {
        super(animalTitle, name, breed, height, weight, eyeColor, sound, isVaccinated,
                color, birthdate);
    }

    public Cat(String name, String breed, double height, double weight,
            String eyeColor, Boolean isVaccinated, String color,
            String birthdate, Boolean hasFur) {
        this("Кот", name, breed, height, weight, eyeColor, isVaccinated, color,
                birthdate, hasFur, "МЯАААУ!!!");
        this.hasFur = hasFur;
    }

    public static HashMap<String, String> getFieldNames() {
        HashMap<String, String> fNames = new HashMap<>();
        fNames.putAll(fieldNames);
        fNames.putAll(Map.of("hasFur", "Boolean"));
        return fNames;
    }

    public Boolean getHasFur() {
        return hasFur;
    }

    public String getInfo() {
        info = new String[] { "hasFur: ", hasFur.toString() };
        StringBuilder sb = new StringBuilder();
        sb.append(super.getInfo());
        for (int i = 0; i < info.length; i += 2) {
            sb.append(info[i]);
            sb.append(info[i + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
