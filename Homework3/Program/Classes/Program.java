package Sem2;

import Sem2.Figures.*;

import Sem2.Figures.Base.*;

public class Sem {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle(), new Rectangle(), new Circle(), new Square()};
        for(Figure figure : figures)
            printFigureInfo(figure);
        
    }
    private static void printFigureInfo(Figure figure){
        System.out.println(figure);
        System.out.println(String.format("Area: %f", figure.area()));
        if(figure instanceof Perimeterable){
            Perimeterable perimeterable = (Perimeterable)figure;
            System.out.println(String.format("Length: %f", perimeterable.perimeter()));
        }
        if(figure instanceof Lengthable){
            Lengthable lengthable = (Lengthable)figure;
            System.out.println(String.format("Length: %f", lengthable.length()));
        }
    }
}
