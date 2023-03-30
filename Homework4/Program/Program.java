package Homework4.Program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Homework3.Program.Classes.Figures.Circle;
import Homework3.Program.Classes.Figures.Rectangle;
import Homework3.Program.Classes.Figures.Square;
import Homework3.Program.Classes.Figures.Triangle;
import Homework3.Program.Classes.Figures.Base.Figure;

public class Program {
    public static void main(String[] args) {
        // Repository<Figure> ac1 = new Repository<>(new Figure[] { new Circle(), new Triangle(), new Square() });
        Repository<Integer> ac1 = new Repository<>(new Integer[] { 1, 2, 3 });
        System.out.println(ac1.count());
        System.out.println(ac1.printArray());
        System.out.println();

        // System.out.println("вставка (2) прямоугольник");
        // ac1.insert(2, new Rectangle());
        // ac1.add(null);
        ac1.add(5);
        ac1.add(7);
        ac1.add(3);
        System.out.println(ac1.getElement(1));
        System.out.println();
        // System.out.println(ac1.printArray());
        // System.out.println();
        // ac1.remove(1);        
        
        // ac1.add(new Circle());
        // ac1.add(new Circle());
        // Figure fig1 = new Triangle();
        // ac1.removeAll(fig1);
        // System.out.println(ac1.getIndex(fig1));

        System.out.println(ac1.contains(5));

        // ac1.remove(2);
        // System.out.println("удалили (1) треугольник");
        // System.out.println(ac1.count());
        System.out.println(ac1.printArray());

        // System.out.println();
        // System.out.println("Вставили (2) треугольник");
        // ac1.insert(2, new Triangle());
        // System.out.println(ac1.printArray());

        // System.out.println();
        // System.out.println("Удалили (0) круг");
        // ac1.remove(0);
        // System.out.println(ac1.printArray());
    }
}
