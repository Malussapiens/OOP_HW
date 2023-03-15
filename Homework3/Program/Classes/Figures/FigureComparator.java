package Homework3.Program.Classes.Figures;

import java.util.Comparator;

import Homework3.Program.Classes.Figures.Base.Figure;

public class FigureComparator implements Comparator<Figure> {
    public int compare(Figure fig1, Figure fig2){
        return Double.compare(fig1.area(), fig2.area());
    }
}
