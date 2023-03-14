package Homework3.Program;

import Homework3.Program.Classes.FigureCollection;
import Homework3.Program.Classes.Figures.Circle;
import Homework3.Program.Classes.Figures.Rectangle;
import Homework3.Program.Classes.Figures.Square;
import Homework3.Program.Classes.Figures.Triangle;
import Homework3.Program.Classes.Figures.Base.Figure;
import Homework3.Program.Classes.Figures.Base.Lengthable;
import Homework3.Program.Classes.Figures.Base.Perimeterable;

public class Program {
    public static void main(String[] args) {
        // Демонстрация семинар
        // Figure[] figures = { new Triangle(), new Rectangle(), new Circle(), new
        // Square() };
        // for (Figure figure : figures)
        // printFigureInfo(figure);
        
        // демонстрация ДЗ
        FigureCollection<Figure> fc = new FigureCollection<>();
        
        fc.add(new Triangle());
        fc.add(new Circle());
        fc.add(new Square());
        
        System.out.println("Периметры:");
        System.out.println(fc.calcAllPerimeters());
        
        System.out.println("Площади:");
        System.out.println(fc.calcAllAreas());
        
        System.out.println("Вся информация:");
        System.out.println(fc.getAllFiguresInfo());
    }

    // выполнено в рамках семинара
    private static void printFigureInfo(Figure figure) {
        System.out.println(figure);
        System.out.println(String.format("Area: %f", figure.area()));
        if (figure instanceof Perimeterable) {
            Perimeterable perimeterable = (Perimeterable) figure;
            System.out.println(String.format("Length: %f", perimeterable.perimeter()));
        }
        if (figure instanceof Lengthable) {
            Lengthable lengthable = (Lengthable) figure;
            System.out.println(String.format("Length: %f", lengthable.length()));
        }
    }
}
