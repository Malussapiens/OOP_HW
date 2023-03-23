package Homework4.Program;

import Homework3.Program.Classes.Figures.Circle;
import Homework3.Program.Classes.Figures.Rectangle;
import Homework3.Program.Classes.Figures.Square;
import Homework3.Program.Classes.Figures.Triangle;
import Homework3.Program.Classes.Figures.Base.Figure;

public class Program {
    public static void main(String[] args) {
        // ArrayControl<Figure> ac1 = new ArrayControl<>(new Figure[]{new Circle(), new Triangle(), new Square()});
        ArrayControl<Integer> ac1 = new ArrayControl<>();
        System.out.println(ac1.count());
        System.out.println(ac1.printArray());
        System.out.println();
        
        // ac1.insert(2, new Rectangle());
        ac1.add(5);
        ac1.add(7);
        ac1.add(3);
        System.out.println(ac1.count());
        System.out.println(ac1.printArray());

        ac1.remove(1);
        System.out.println(ac1.count());
        System.out.println(ac1.printArray());
        // System.out.println();
        // ac1.insert(2, new Rectangle());
        // ac1.printArray();

        // System.out.println();
        // ac1.remove(2);
        // ac1.printArray();
    }
}
