package Homework2.Program.Classes;

import Homework2.Program.Classes.Animals.Cat;
import Homework2.Program.Classes.Animals.Dog;
import Homework2.Program.Classes.Animals.Hen;
import Homework2.Program.Classes.Animals.Stork;
import Homework2.Program.Classes.Animals.Tiger;
import Homework2.Program.Classes.Animals.Wolf;
import Homework2.Program.Classes.Animals.Base.Animal;

import java.util.HashMap;
import java.util.Scanner;

// Создание животного
public class AnimalCreator {
    public static Animal createAnimal(String animalClassName) throws Exception {
        switch (animalClassName.toLowerCase()) {
            case "кошка":
                return CreateCat(getPropValues(Cat.getFieldNames()));
            case "собака":
                return createDog(getPropValues(Dog.getFieldNames()));
            case "курица":
                return createHen(getPropValues(Hen.getFieldNames()));
            case "тигр":
                return createTiger(getPropValues(Tiger.getFieldNames()));
            case "волк":
                return createWolf(getPropValues(Wolf.getFieldNames()));
            default:
                throw new Exception("incorrect name!");
        }
    }

    private static HashMap<String, String> getPropValues(HashMap<String, String> fields) {

        // словарь значений свойств животного
        HashMap<String, String> props = new HashMap<>();

        // Заполняем список значений свойств
        Scanner sc = new Scanner(System.in, "cp866");
        for (String key : fields.keySet()) {
            System.out.println("Введите " + key + ": ");
            props.put(key, sc.nextLine());
        }
        return props;
    }

    private static Cat CreateCat(HashMap<String, String> props) {
        return new Cat(
                (String) props.get("name"),
                (String) props.get("breed"),
                Double.parseDouble((String) (props.get("height"))),
                Double.parseDouble((String) (props.get("weight"))),
                (String) props.get("eyeColor"),
                Boolean.parseBoolean((String) (props.get("isVaccinated"))),
                (String) props.get("color"),
                (String) props.get("birthDate"),
                Boolean.parseBoolean((String) (props.get("hasFur"))));
    }

    private static Dog createDog(HashMap<String, String> props) {
        return new Dog(
                (String) props.get("name"),
                (String) props.get("breed"),
                Double.parseDouble((String) (props.get("height"))),
                Double.parseDouble((String) (props.get("weight"))),
                (String) props.get("eyeColor"),
                Boolean.parseBoolean((String) (props.get("isVaccinated"))),
                (String) props.get("color"),
                (String) props.get("birthDate"),
                Boolean.parseBoolean((String) (props.get("isTrained"))));
    }

    public static Hen createHen(HashMap<String, String> props) {
        return new Hen(
                Double.parseDouble((String) (props.get("height"))),
                Double.parseDouble((String) (props.get("weight"))),
                (String) props.get("eyeColor"),
                Integer.parseInt(props.get("flyAltitude")));
    }

    public static Stork createStork(HashMap<String, String> props) {
        return new Stork(
                Double.parseDouble((String) (props.get("height"))),
                Double.parseDouble((String) (props.get("weight"))),
                (String) props.get("eyeColor"),
                Integer.parseInt(props.get("flyAltitude")));
    }

    public static Tiger createTiger(HashMap<String, String> props) {
        return new Tiger(
                Double.parseDouble((String) (props.get("height"))),
                Double.parseDouble((String) (props.get("weight"))),
                (String) props.get("eyeColor"),
                (String) props.get("habitArea"),
                (String) props.get("catchDate"));
    }

    public static Wolf createWolf(HashMap<String, String> props) {
        return new Wolf(
                Double.parseDouble((String) (props.get("height"))),
                Double.parseDouble((String) (props.get("weight"))),
                (String) props.get("eyeColor"),
                (String) props.get("habitArea"),
                (String) props.get("catchDate"),
                Boolean.parseBoolean((String) (props.get("isLeader"))));
    }
}
