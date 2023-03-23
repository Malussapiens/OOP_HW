package Homework3.Program.Classes.Figures.Base;

public interface Figure extends Comparable<Figure> {
     double area();
     int compareTo(Figure figure);
     
}
