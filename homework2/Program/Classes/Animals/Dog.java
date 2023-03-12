package Homework2.Program.Classes.Animals;

import Homework2.Program.Classes.Animals.Base.PetAnimal;

public class Dog extends PetAnimal {
    private boolean isTrained;
    protected String[] info;

    private Dog(String animalTitle, String name, String breed, double height, double weight,
            String eyeColor, String sound, Boolean isVaccinated, String color, String birthdate,
            boolean isTrained) {
        super(animalTitle, name, breed, height, weight, eyeColor, sound, isVaccinated,
                color, birthdate);
    }

    public Dog(String name, String breed, double height, double weight, String eyeColor,
            Boolean isVaccinated, String color, String birthdate,
            boolean isTrained) {
        this("Собака", name, breed, height, weight, eyeColor,
                "Гав-Гав!", isVaccinated, color, birthdate, isTrained);
        this.isTrained = isTrained;
    }

    public Boolean getIsTrained() {
        return isTrained;
    }

    public void train() {
        if (this.isTrained != true) {
            isTrained = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Собака ");
        sb.append(name);
        sb.append(" прошла курс дрессировки.");
        System.out.println(sb.toString());
    }

    public String getHenInfo() {
        this.info = new String[] { "isTrained: ", ((Boolean) isTrained).toString() };
        StringBuilder sb = new StringBuilder();
        sb.append(super.getInfo());
        for (int i = 0; i < this.info.length; i += 2) {
            sb.append(this.info[i]);
            sb.append(this.info[i + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
