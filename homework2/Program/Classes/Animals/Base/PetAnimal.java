package Homework2.Program.Classes.Animals.Base;

import Homework2.Program.Interfaces.Animals.IPet;
import java.util.Map;
import java.util.HashMap;

public abstract class PetAnimal extends Animal implements IPet {
    protected String name;
    protected String breed;
    protected Boolean isVaccinated;
    protected String color;
    protected String birthDate;
    protected String[] petInfo;
    private static Map<String, String> fieldNames = Animal.getFieldNames();

    public PetAnimal(String animalTitle, String name, String breed, double height, double weight, String eyeColor,
            String sound, Boolean isVaccinated, String color, String birthDate) {
        super(animalTitle, height, weight, eyeColor, sound);
        this.name = name;
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        this.color = color;
        this.birthDate = birthDate;
    }

    public void caress() {
        System.out.println(animalTitle + " проявляет ласку!");
    }

    public static HashMap<String, String> getFieldNames() {
        HashMap<String, String> fNames = new HashMap<>();
        fNames.putAll(fieldNames);
        fNames.putAll(Map.of(
                "name", "String",
                "breed", "String",
                "isVaccinated", "Boolean",
                "color", "String",
                "birthDate", "String"));
        return fNames;
    }

    public String getInfo() {
        this.petInfo = new String[] { "name: ", name, "breed: ", breed,
                "isVaccinated: ", isVaccinated.toString(), "color: ", color,
                "birthdate: ", birthDate };
        StringBuilder sb = new StringBuilder();
        sb.append(super.getInfo());
        for (int i = 0; i < this.petInfo.length; i += 2) {
            sb.append(this.petInfo[i]);
            sb.append(this.petInfo[i + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
