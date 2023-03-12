package Homework2.Program;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import Homework2.Program.Classes.AnimalCreator;
import Homework2.Program.Classes.Zoo;

public class Program {
    public static void main(String[] args) {

        // Главное меню
        TreeMap<Integer, String> mainMenu = new TreeMap<>();
        mainMenu.putAll(Map.of(
                1, "Добавить новое животное",
                2, "Убрать животное",
                3, "Посмотреть информацию о животном (по номеру)",
                4, "Посмотреть информацию обо всех животных",
                5, "Попросить животное (по номеру) издать звук",
                6, "Попросить всех животных издать звук"));
        // меню добавления животного
        TreeMap<Integer, String> animalsMenu = new TreeMap<>();
        animalsMenu.putAll(Map.of(
                1, "Кошка",
                2, "Собака",
                3, "Волк",
                4, "Тигр",
                5, "Курица",
                6, "Аист"));
        // создает зоопарк
        Zoo zoo = new Zoo();

        Scanner sc = new Scanner(System.in);
        boolean stopMainMenu = false;
        do {
            int choice;
            printMenu(mainMenu);
            choice = getInteger(sc);
            switch (choice) {
                case 1:
                    boolean stopAddMenu = false;
                    do {
                        System.out.println("Какое животное хотите добавить?");
                        printMenu(animalsMenu);
                        try {
                            choice = getInteger(sc);
                            switch (choice) {
                                case 0:
                                    break;
                                default:
                                    // добавляет животных в зоопарк
                                    zoo.add(AnimalCreator.createAnimal(
                                            animalsMenu.get(choice)));
                                    // stopAddMenu = true;
                                    System.out.println();
                                    break;
                            }
                            stopAddMenu = true;
                        } catch (Exception e) {
                            System.out.println("Неверный параметр");
                        }
                    } while (!stopAddMenu);
                    break;
                case 2:
                    System.out.println("Какое животное хотите убрать? (введите индекс)");
                    System.out.println("-1 для возврата");
                    choice = getInteger(sc);
                    if (choice >= 0) {
                        if (zoo.remove(choice) < 0) {
                            System.out.println("Нет животного с таким индексом!");
                        } else {
                            System.out.println("Животное удалено.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Какое животное хотите посмотреть? (введите индекс)");
                    System.out.println("-1 для возврата");
                    choice = getInteger(sc);
                    if (choice >= 0) {
                        if (zoo.getAnimalInfo(choice) == null) {
                            System.out.println("Нет животного с таким индексом!");
                        } else {
                            System.out.println(zoo.getAnimalInfo(choice));
                        }
                    }
                case 4:
                    if (zoo.getCount() == 0) {
                        System.out.println("Зоопарк пуст!");
                    } else {
                        for (String animal : zoo.getAllInfo()) {
                            System.out.println(animal);
                        }
                    }
                case 5:
                    System.out.println("Какое животное должно издать звук? (введите индекс)");
                    System.out.println("-1 для возврата");
                    choice = getInteger(sc);
                    if (choice >= 0) {
                        if (zoo.makeAnimalSound(choice) == null) {
                            System.out.println("Нет животного с таким индексом!");
                        } else {
                            System.out.println(zoo.makeAnimalSound(choice));
                        }
                    }
                case 6:
                    if (zoo.getCount() == 0) {
                        System.out.println("Зоопарк пуст!");
                    } else {
                        for (String sound : zoo.makeAllAnimalSound()) {
                            System.out.println(sound);
                        }
                    }
                    break;
                default:
                    System.out.println("Неверный ввод!");
                    break;
            }

        } while (!stopMainMenu);

        // получает инфо обо всех животных в зоопарке
        String[] info = zoo.getAllInfo();
        for (String string : info) {
            System.out.println(string);
        }
    }

    public static void printMenu(TreeMap<Integer, String> menu) {
        System.out.println(menu.entrySet());
        System.out.println("0=Выход");
    }

    public static Integer getInteger(Scanner sc) {
        return Integer.parseInt(sc.nextLine());
    }
}
