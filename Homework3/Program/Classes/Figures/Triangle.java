package Homework3.Program.Classes.Figures;

import Homework3.Program.Classes.Figures.Base.Polygon;

public class Triangle extends Polygon {

    public Triangle(int a, int b, int c) {
        super(new int[] { a, b, c });

    }

    public Triangle() {
        this(3, 3, 2);
    }

    @Override
    public double area() {
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String toString() {
        return "Треугольник";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Triangle))
            return false;
        return true;
    }
}
