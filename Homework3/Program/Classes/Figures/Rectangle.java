package Homework3.Program.Classes.Figures;

import Homework3.Program.Classes.Figures.Base.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(int a, int b) {
        super(new int[] { a, b, a, b });
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

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Rectangle))
            return false;
        return true;
    }
}

