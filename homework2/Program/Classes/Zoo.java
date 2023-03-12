package Homework2.Program.Classes;

import java.util.ArrayList;

import Homework2.Program.Classes.Animals.Base.Animal;

public class Zoo {
    private ArrayList<Animal> zoo = new ArrayList<>();
    private int animalCount;

    public Zoo() {
        animalCount = 0;
    }

    public boolean isValid(int animalIndex) {
        if (animalCount < animalIndex + 1 || animalCount == 0) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return animalCount;
    }

    public void add(Animal animal) {
        zoo.add(animal);
        animalCount++;
    }

    public int remove(int animalIndex) {
        if (!isValid(animalIndex)) {
            return -1;
        }
        zoo.remove(animalIndex);
        animalCount--;
        return 1;
    }

    public String getAnimalInfo(int animalIndex) {
        if (isValid(animalIndex))
            return (zoo.get(animalIndex)).getInfo();
        return null;
    }

    public String[] getAllInfo() {
        String[] arr = new String[zoo.size()];
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder().append("Животное ");
            sb.append(i);
            sb.append(":\n");
            arr[i] = sb.append(getAnimalInfo(i)).toString();
        }
        return arr;
    }

    public String makeAnimalSound(int animalIndex) {
        if (isValid(animalIndex))
            return (zoo.get(animalIndex)).makeSound();
        return null;
    }

    public String[] makeAllAnimalSound() {
        String[] arr = new String[zoo.size()];
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(zoo.get(i).makeSound());
            sb.append("\n");
            arr[i] = sb.toString();
        }
        return arr;
    }
}
