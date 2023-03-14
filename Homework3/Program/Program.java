package Homework3.Program;

import Homework3.Program.Classes.Figures.Circle;
import Homework3.Program.Classes.Figures.Rectangle;
import Homework3.Program.Classes.Figures.Square;
import Homework3.Program.Classes.Figures.Triangle;
import Homework3.Program.Classes.Figures.Base.Figure;
import Homework3.Program.Classes.Figures.Base.Lengthable;
import Homework3.Program.Classes.Figures.Base.Perimeterable;

public class Program {
    public static void main(String[] args) {
        Figure[] figures = { new Triangle(), new Rectangle(), new Circle(), new Square() };
        for (Figure figure : figures)
            printFigureInfo(figure);
    }

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
