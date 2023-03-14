package Homework3.Program.Classes;

import java.util.ArrayList;
import java.util.List;

import Homework3.Program.Classes.Figures.Base.Figure;
import Homework3.Program.Classes.Figures.Base.Lengthable;
import Homework3.Program.Classes.Figures.Base.Perimeterable;

public class FigureCollection<T extends Figure> {
    private List<Figure> col;
    private int counter;

    public FigureCollection() {
        col = new ArrayList<>();
        counter = 0;
    }

    // 1. Добавить новую фигуру
    public void add(T figure) {
        col.add(figure);
        counter++;
    }

    // 2. Посчитать периметр у всех фигур
    private double getPerimeter(Figure figure) {
        return ((Perimeterable) figure).perimeter();
    }

    public String calcAllPerimeters() {
        StringBuilder sb = new StringBuilder();
        for (Figure figure : col) {
            if (figure instanceof Perimeterable) {
                sb.append(String.format("%s(%d): %f\n",
                        figure, col.indexOf(figure), getPerimeter(figure)));
            }
        }
        return sb.toString();
    }

    // 3. Посчитать площадь у всех фигур
    private double getArea(Figure figure) {
        return figure.area();
    }

    public String calcAllAreas() {
        StringBuilder sb = new StringBuilder();
        for (Figure figure : col) {
            sb.append(String.format("%s(%d): %f\n",
                    figure, col.indexOf(figure), getArea(figure)));
        }
        return sb.toString();
    }

    // 1. Вывода информации о всех периметрах, площадях и длинах окружности всех
    // фигур, где это возможно,
    private double getLength(Figure figure) {
        return ((Lengthable) figure).length();
    }

    public String getAllFiguresInfo() {
        StringBuilder sb = new StringBuilder();
        for (Figure figure : col) {
            sb.append(String.format("%s(%d):\n", figure, counter));
            sb.append(String.format("площадь: %f\n", getArea(figure)));
            if (figure instanceof Perimeterable) {
                sb.append(String.format("периметр: %f\n", getPerimeter(figure)));
            } else if (figure instanceof Lengthable) {
                sb.append(String.format("длина окружности: %f\n", getLength(figure)));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // 3. удаления фигуры,
    public void remove(int index) {
        System.out.println("Удаляем фигуру по индексу " + index);
    }

    // 4. изменения фигуры по индексу,
    public void replace(Figure figure, int index) {
        System.out.println("Заменяем фигуру по индексу " + index);
    }
    // 5. сортировки по площади, вывод информации о всех фигурах.
}
