package Homework2.Program.Classes.Animals;

import Homework2.Program.Classes.Animals.Base.WildAnimal;
import java.util.Map;
import java.util.HashMap;

public class Wolf extends WildAnimal {
    private Boolean isLeader;
    private static Map<String, String> fieldNames = WildAnimal.getFieldNames();

    private Wolf(String animalTitle, Double height, Double weight, String eyeColor,
            String sound, String habitArea, String catchDate) {
        super(animalTitle, height, weight, eyeColor, sound, habitArea, catchDate);
    }

    public Wolf(Double height, Double weight, String eyeColor,
            String habitArea, String catchDate, Boolean isLeader) {
        this("Волк", height, weight, eyeColor, "АУУУУУ!", habitArea,
                catchDate);
        this.isLeader = isLeader;
    }

    public static HashMap<String, String> getFieldNames() {
        HashMap<String, String> fNames = new HashMap<>();
        fNames.putAll(fieldNames);
        fNames.putAll(Map.of(
                "isLeader", "Boolean"));
        return fNames;
    }
    
    public Boolean getIsLeader() {
        return isLeader;
    }

    public String getHenInfo() {
        this.wildInfo = new String[] { "is_leader: ", isLeader.toString() };
        StringBuilder sb = new StringBuilder();
        sb.append(super.getInfo());
        for (int i = 0; i < this.wildInfo.length; i += 2) {
            sb.append(this.wildInfo[i]);
            sb.append(this.wildInfo[i + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
