package Homework2.Program.Classes.Animals.Base;

import java.util.Map;
import java.util.HashMap;

import Homework2.Program.Interfaces.Animals.IFlyable;

// Для класса нелетающих птиц можно переопределить метод Fly()
// или убрать Iflyable из Bird и выбирать имплементацию для дочерних классов.
public abstract class Bird extends Animal implements IFlyable {
    protected int flyAltitude;
    private String[] birdInfo;
    private static Map<String, String> fieldNames = Animal.getFieldNames();

    protected Bird(String animalTitle, Double height, Double weight, String eyeColor,
            String sound, int flyAltitude) {
        super(animalTitle, height, weight, eyeColor, sound);
        this.flyAltitude = flyAltitude;
    }

    public static HashMap<String, String> getFieldNames(){
        HashMap<String, String> fNames = new HashMap<>();
        fNames.putAll(fieldNames);
        fNames.putAll(Map.of("flyAltitude", "Integer"));
        return fNames;
    }

    public void fly() {
        StringBuilder sb = new StringBuilder();
        sb.append("Я летаю на ");
        sb.append(flyAltitude);
        sb.append(" метрах.");
        System.out.println(sb.toString());
    }

    public String getInfo() {
        birdInfo = new String[] { "fly altitude: ", ((Integer) flyAltitude).toString() };
        StringBuilder sb = new StringBuilder();
        sb.append(super.getInfo());

        for (int i = 0; i < birdInfo.length; i += 2) {
            sb.append(birdInfo[i]);
            sb.append(birdInfo[i + 1]);
            sb.append("\n");
        }
        
        return sb.toString();
    }
}
