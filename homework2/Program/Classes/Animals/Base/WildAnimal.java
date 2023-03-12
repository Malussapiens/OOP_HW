package Homework2.Program.Classes.Animals.Base;

import java.util.Map;
import java.util.HashMap;

public abstract class WildAnimal extends Animal {
    protected String habitArea;
    protected String catchDate;
    protected String[] wildInfo;
    private static Map<String, String> fieldNames = Animal.getFieldNames();

    public WildAnimal(String animalTitle, Double height, Double weight, String eyeColor,
            String sound, String habitArea, String catchDate) {
        super(animalTitle, height, weight, eyeColor, sound);
        this.habitArea = habitArea;
        this.catchDate = catchDate;
    }

    public static HashMap<String, String> getFieldNames() {
        HashMap<String, String> fNames = new HashMap<>();
        fNames.putAll(fieldNames);
        fNames.putAll(Map.of(
                "habitArea", "String",
                "catchDate", "String"));
        return fNames;
    }
    
    public String getInfo() {
        wildInfo = new String[] { "habitArea: ", habitArea, "catchDate: ", catchDate };
        StringBuilder sb = new StringBuilder();
        sb.append(super.getInfo());
        for (int i = 0; i < wildInfo.length; i += 2) {
            sb.append(wildInfo[i]);
            sb.append(wildInfo[i + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
