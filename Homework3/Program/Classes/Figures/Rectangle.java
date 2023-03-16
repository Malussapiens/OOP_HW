package Homework3.Program.Classes.Figures;

import Homework3.Program.Classes.Figures.Base.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(int a, int b) {
        super(new int[] { a, b, a, b });
        try {
            if (a == 0 || b == 0) {
                throw new Exception("Длина сторон прямоугольника должна быть больше 0");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public Rectangle() {
        this(2, 4);
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник");
    }
}
